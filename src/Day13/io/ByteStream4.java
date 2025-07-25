package Day13.io;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ByteStream4 {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("D:\\01\\111\\a.txt");
        int read ;
        while ((read=fr.read()) != -1){
            System.out.print((char) read);
        }
        fr.close();
    }
}
