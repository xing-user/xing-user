package Day15.webcrawl;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Spider {
    public static void main(String[] args) throws IOException {

    String fanmilyName = "https://hanyu.baidu.com/shici/detail?pid=0b2f26d4c0ddb3ee693fdb1137ee1b0d";
    String boyName  ="https://www.meimeiming.com/zhouyi/5143.html";
    String girlName = "https://www.meimeiming.com/zhouyi/8347.html";

    //调用方法

        String fName = webCrawl(fanmilyName);
        String bName = webCrawl(boyName);
        String gName = webCrawl(girlName);

        ArrayList<String> fanmilyTempData = getData(fName, "([\\u4e00-\\u9fa5]{4})(，|。)", 1);
        ArrayList<String> bTempData = getData(bName, "(\\d+、)([\\u4e00-\\u9fa5]{2})", 2);
        ArrayList<String> gTempData = getData(gName, "(\\d+、)([\\u4e00-\\u9fa5]{2})",2);

        ArrayList<String> familyData = new ArrayList<>();

        for (String fname : fanmilyTempData) {
            for (int i = 0; i < fname.length(); i++) {
                char c = fname.charAt(i);
                familyData.add(c+"");
            }
        }
        //男生和女生的去重操作
        ArrayList<String> boyData = new ArrayList<>();
        bTempData.stream().distinct().forEach(boyData::add);

        ArrayList<String> girlData = new ArrayList<>();
        gTempData.stream().distinct().forEach(girlData::add);

        //生成数据
        ArrayList<String> infos = getInfos(familyData, boyData, girlData, 10, 15);
        Collections.shuffle(infos);
        for (String info : infos) {
            System.out.println(info);
        }
        //写入
        BufferedWriter rw = new BufferedWriter(new FileWriter("try01.txt"));
        for (String info : infos) {
            rw.write(info);
            rw.newLine();
        }

        rw.close();
    }

    public static ArrayList<String> getInfos(ArrayList<String> familyData,ArrayList<String> boyData,ArrayList<String> girlData ,int boycount,int girlcount){
        ArrayList<String> info = new ArrayList<>();
        HashSet<String> boys = new HashSet<>();
        while (true){
            if(boys.size() == boycount){
                break;
            }
            //打乱顺序
            Collections.shuffle(familyData);
            Collections.shuffle(boyData);
            boys.add(familyData.get(0) + boyData.get(0));
        }
        HashSet<String> girls = new HashSet<>();
        while (true){
            if(girls.size() == boycount){
                break;
            }
            //打乱顺序
            Collections.shuffle(familyData);
            Collections.shuffle(boyData);
            girls.add(familyData.get(0) + boyData.get(0));
        }
        //张三-男-26
        Random r = new Random();
        for (String boy : boys) {
            int age = r.nextInt(10) + 18;
            info.add(boy + "-男-" +age);
        }
        for (String girl : girls) {
            int age = r.nextInt(8) + 18;
            info.add(girl + "-女-" +age);
        }
        return info;
    }
    private static ArrayList<String> getData(String str, String regex,int index) {
        //创建一个列表
        ArrayList<String> list = new ArrayList<>();
        //获取一个正则表达式的对象
        Pattern pattern = Pattern.compile(regex);
        //调用matcher方法
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()) {
            String url = matcher.group(index);
            list.add(url);
        }
        return list;
    }

    public static String webCrawl(String url) throws IOException {
        //创建一个容器来存储数据
        StringBuilder sb = new StringBuilder();
        //创建一个URL对象
        URL net = new URL(url);
        //链接网址

        URLConnection  conn=  net.openConnection();
        //添加请求头
        conn.addRequestProperty("user-agent","Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/" +
                "537.36 (KHTML, like Gecko) Chrome/138.0.0.0 Safari/537.36 Edg/138.0.0.0");
        conn.addRequestProperty("Referer", url);
        //读取数据
        InputStreamReader isr = new InputStreamReader(conn.getInputStream());
        int len;
        char[] chars = new char[1024];
        while ((len=isr.read(chars))!=-1){
            sb.append((new String(chars,0,len)));
        }
        //将读取到的数据转换到String
        String string = sb.toString();
        //关流
        isr.close();
        return string;
    }
}
