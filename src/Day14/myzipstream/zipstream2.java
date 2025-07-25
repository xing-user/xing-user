package Day14.myzipstream;

import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class zipstream2 {
    public static void main(String[] args) throws IOException {
        //创建压缩文件对象
        File src = new File("D:\\BaiduNetdiskDownload\\JavaSE\\day13-面向对象进阶（static&继承）");
        //压缩包的父级路径
        File dstParent = new File(src.getParent());
        //压缩包的路径
        File dst = new File(dstParent, src.getName() + ".zip");
        //创建压缩数据流关联压缩包
        ZipOutputStream out = new ZipOutputStream(new FileOutputStream(dst));
        //将src中的文件放入压缩包
        tozip(src, out, src.getName());
        //释放资源
        out.close();
    }

    /*
     *
     * 作用：获取src中的每一个文件，变成Zipentry对象，放到压缩包中
     * 参数一：压缩流
     * 参数二：压缩流
     * 参数三：压缩包的内部路径
     * */
    public static void tozip(File src, ZipOutputStream out, String name) throws IOException {
        //1.进入src路径
        File[] files = src.listFiles();

        //2.遍历数组
        if (files != null) {
            for (File file : files) {
                if (file.isDirectory()) {
                    //如果是文件夹
                    tozip(file, out, name + "\\" + file.getName());
                } else if (file.isFile()) {
                    //文件:变成Zipentry对象
                    ZipEntry entry = new ZipEntry(name + "\\" + file.getName());
                    out.putNextEntry(entry);
                    //放入数据
                    int len;
                    byte[] buf = new byte[1024];
                    //开启
                    FileInputStream in = new FileInputStream(file);
                    while ((len = in.read(buf)) != -1) {
                        out.write(buf, 0, len);
                    }
                    //关闭
                    in.close();
                    out.closeEntry();
                }
            }
        }
    }
}
