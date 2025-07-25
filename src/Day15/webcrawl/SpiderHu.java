package Day15.webcrawl;

import cn.hutool.core.io.FileUtil;
import cn.hutool.core.util.ReUtil;
import cn.hutool.http.HttpUtil;
import org.apache.commons.io.FileUtils;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class SpiderHu {
    public static void main(String[] args) throws IOException {

        String fanmilyName = "https://hanyu.baidu.com/shici/detail?pid=0b2f26d4c0ddb3ee693fdb1137ee1b0d";
        String boyName  ="https://www.meimeiming.com/zhouyi/5143.html";
        String girlName = "https://www.meimeiming.com/zhouyi/8347.html";

        String fName = HttpUtil.get(fanmilyName);
        String bName = HttpUtil.get(boyName);
        String gName = HttpUtil.get(girlName);


        List<String> fanmilyTempData = ReUtil.findAll("([\\u4e00-\\u9fa5]{4})(，|。)",fName, 1);
        List<String> bTempData = ReUtil.findAll("(\\d+、)([\\u4e00-\\u9fa5]{2})", bName, 2);
        List<String> gTempData = ReUtil.findAll("(\\d+、)([\\u4e00-\\u9fa5]{2})",gName,  2);


        System.out.println(fanmilyTempData);
        System.out.println(bTempData);
        System.out.println(gTempData);
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

        //写出
        FileUtil.writeLines(infos,"try03.txt","utf-8");

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
}
