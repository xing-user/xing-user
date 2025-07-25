package Day13.io;

import java.io.FileInputStream;
import java.io.IOException;

public class ByteStream2 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("src\\Day13\\io\\a.txt");
        int b;
        while ((b = fis.read()) != -1){
            System.out.print((char)b );
        }

        fis.close();
    }
}
