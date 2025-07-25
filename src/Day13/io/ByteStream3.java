package Day13.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class ByteStream3 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis2=new FileInputStream("src\\Day13\\io\\a.txt");
        FileOutputStream fos=new FileOutputStream("D:\\01\\111\\a.txt");
        long start = System.currentTimeMillis();
        byte[] b =new byte[1024];
        int len;
        len = fis2.read(b);
        System.out.println(len);
        /*byte[] a = fis2.readAllBytes();
        System.out.println(a.length);*/
        /*byte[] bytes = fis2.readAllBytes();
        System.out.println(new String(bytes));*/
        fos.write(b,0,len);
        long end = System.currentTimeMillis();
        System.out.println(end-start);
        fos.close();
        fis2.close();
    }
}
