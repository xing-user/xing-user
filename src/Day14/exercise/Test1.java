package Day14.exercise;

import java.io.*;

public class Test1 {
    public static void main(String[] args) throws IOException {
        long start = System.currentTimeMillis();
        //字节流:一次只读一个字节
        //mo1();
        //读一个字节数组
        //mo2();
        //字节缓冲流：一次只读一个字节
        //mo3();
        //读一个字节数组
        mo4();
        long end = System.currentTimeMillis();
        System.out.println((end-start)/1000.0 + "秒");
    }
    public static void mo1() throws IOException {
        FileInputStream fis = new FileInputStream("D:\\Workconditions\\linux.iso");
        FileOutputStream fos = new FileOutputStream("D:\\code\\JavaSE\\BaseVersion" +
                "\\JavaSE\\src\\Day14\\exercise\\linux.iso");
        int len;

        while ((len = fis.read()) != -1) {
            fos.write(len);
        }


        fis.close();
        fos.close();
    }
    public static void mo2() throws IOException{
        FileInputStream fis = new FileInputStream("D:\\Workconditions\\linux.iso");
        FileOutputStream fos = new FileOutputStream("D:\\code\\JavaSE\\BaseVersion" +
                "\\JavaSE\\src\\Day14\\exercise\\linux.iso");
        int len;
        byte[] b = new byte[8192];
        while ((len = fis.read(b)) != -1) {
            fos.write(b,0,len);
        }

        fis.close();
        fos.close();
    }
    public static void mo3() throws IOException{
        BufferedInputStream fr = new BufferedInputStream(new FileInputStream("D:\\Workconditions\\linux.iso"));
        BufferedOutputStream br = new BufferedOutputStream(new FileOutputStream("D:\\code\\JavaSE\\BaseVersion\\JavaSE\\src\\Day14\\exercise\\linux.iso"));
        int len;

        while ((len = fr.read()) != -1) {
            br.write(len);
        }

        fr.close();
        br.close();
    }
    public static void mo4() throws IOException{
        BufferedInputStream fr = new BufferedInputStream(new FileInputStream("D:\\Workconditions\\linux.iso"));
        BufferedOutputStream br = new BufferedOutputStream(new FileOutputStream("D:\\code\\JavaSE\\BaseVersion\\JavaSE\\src\\Day14\\exercise\\linux.iso"));
        int len;
        byte[] b = new byte[8192];
        while ((len = fr.read(b)) != -1) {
            br.write(b,0,len);
        }
        fr.close();
        br.close();
    }
}
