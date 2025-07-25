package Day14.exercise;

import java.io.*;
import java.nio.charset.Charset;

public class Test4 {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(new FileInputStream("D:\\BaiduNetdiskDownload\\JavaSE\\day29-IO（其他流）\\资料\\aaa.txt"),"GBK");
        int line;
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("aaa.txt"),"UTF-8");
        while ((line=isr.read())!=-1){
            osw.write(line);
            osw.flush();
        }
        isr.close();

        osw.write("你好");

        osw.close();
    }
}
