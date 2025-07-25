package Day13.io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ByteStream6 {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("D:\\01\\111\\a.txt",true);
        char[] c = {'a','b','事'};
        fw.write(25105);
        fw.close();
    }
}
