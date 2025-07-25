package Day13.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStream {
    public static void main(String[] args) throws  IOException {
/*
        String src ="D:\\code\\JavaSE\\BaseVersion\\JavaSE\\src\\Day13\\io";
        File file = new File(src);
        //创建异常
        file.createNewFile();
        FileOutputStream fos = new FileOutputStream("D:\\code\\JavaSE\\BaseVersion\\JavaSE\\src\\Day13\\io\\a.txt");
//        fos.write(57);
        byte [] b = {99,99,99};
        fos.write(b,0,b.length);

        fos.close();*/

        File f = new File("D:\\BaiduNetdiskDownload\\app");
        f.mkdir();
    }
}
