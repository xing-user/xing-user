package Day13.io;

import java.io.FileReader;
import java.io.IOException;

public class ByteStream5 {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("D:\\01\\111\\a.txt");


        char[] buf = new char[2];
        int len ;
        while ((len = fr.read(buf)) != -1) {
            System.out.print(new String(buf,0,len));
        }
    }
}
