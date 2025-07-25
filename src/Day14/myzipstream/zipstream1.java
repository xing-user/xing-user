package Day14.myzipstream;

import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

public class zipstream1 {
    public static void main(String[] args) throws IOException {
        //创建文件对象
        File zipfile = new File("D:\\01\\111.zip");
        //创建解压后的文件地址
        File unzipfile =  new File("D:\\01\\");
        unzip(zipfile,unzipfile);
    }
    public static void unzip(File zipfile, File unzipfile) throws IOException {
        //创建解压缩流
        ZipInputStream zis = new ZipInputStream(new  FileInputStream(zipfile));
        //创建解压后的文件对象
        //解压 获取zipentry  对象
        ZipEntry entry ;

        //判断是否还有entry对象
        while ((entry = zis.getNextEntry()) != null) {
            System.out.println(entry);
            File uf = new File(unzipfile,entry.getName());
            //判断是否是文件夹,如果是则添加//name
            if (entry.isDirectory()) {
                uf.mkdirs();
            } //如果不是则把文件添加到文件夹中
            else{
                //创建要添加的文件的字节输出流
                FileOutputStream fos = new FileOutputStream(uf);
                int len;
                while ((len=zis.read()) != -1){
                    fos.write(len);
                }
                fos.close();
            }
        }
        zis.close();
    }
}
