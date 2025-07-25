package Day13.File;

import java.io.File;

public class File4 {
    public static void main(String[] args) {
        String path = "D:\\BaiduNetdiskDownload\\JavaSE\\day29-IO（其他流）";
        File file = new File(path);
        if(file.exists()){
            if(file.isDirectory()){
                long len = getLen(file);
                System.out.println(len/1024/1024+"MB");
            }else  if(file.isFile()){
                file.length();
                long len = getLen(file);
                System.out.println(len/1024/1024+"MB");
            }
        }else {
            System.out.println("路径不正确");
        }
    }
    public static long getLen(File f){
        File[] file = f.listFiles();
        long len = 0;
        if(file!=null){
            for (File file1 : file) {
                if (file1.isDirectory()) {
                    len += getLen(file1);
                } else if (file1.isFile()) {
                    len += file1.length();
                }
            }
        }
        return len;
    }
}
