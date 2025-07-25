package Day14.io;

import java.io.*;

public class ByteStream1 {
    public static void main(String[] args) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("D:\\code\\JavaSE\\" +
                "BaseVersion\\JavaSE\\src\\Day14\\io\\recode.jpg"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("D:\\code\\JavaSE\\" +
                "BaseVersion\\JavaSE\\src\\Day14\\io\\xing.jpg"));

        int len;
        while ((len = bis.read()) != -1) {
            bos.write(len);
        }


        bis.close();
        bos.close();
    }
}
