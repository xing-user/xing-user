package Day14.exercise;

import java.io.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import java.util.StringJoiner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Test2 {
    public static void main(String[] args) throws IOException {
        //创建字符流对象从csb.txt
        FileReader fr = new FileReader("D:\\code\\JavaSE\\BaseVersion\\JavaSE\\src\\Day14\\exercise\\csb.txt");
        //创建StringJoiner对象 存储csb中的数据 分隔符为,
        StringBuilder sb = new StringBuilder();
        //读取数据
        int len;
        while ((len = fr.read())!=-1){
            char c = (char)len;
            //存储字符
            sb.append(c);
        }
        //将存储的字符转化为String对象
        String string = sb.toString();
        //验证
        System.out.println(string);
        //用正则划分得到String类型的数组
        String[] split = string.split("\\r?\\n");
        //数组排序并把数据转换成map类型
        //方法1：创建匿名内部类
        /*Arrays.stream(split).collect(Collectors.toMap(new  Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                String s1 = s.split("//.")[0];
                return Integer.parseInt(s1);
            }
        },new  Function<String, String>() {
            @Override
            public String apply(String s) {
                String s2 = s.split("//.")[1];
                return s2;
            }
        }));*/
        //方法2：lambda
        Map<Integer, String> collect = Arrays.stream(split)
                .collect(Collectors.toMap(s -> Integer.parseInt(s.split("\\.")[0]),
                        s -> (s.split("\\.")[1])));

        //重新写入
        FileWriter br = new FileWriter("D:\\code\\JavaSE\\BaseVersion\\JavaSE\\src\\Day14\\exercise\\csb.txt");
        collect.forEach((k,v)-> {
            try {
                br.write(k+"."+v);
                br.write("\n");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });
        System.out.println("------------------------");
        fr.close();
        br.close();
    }
}
