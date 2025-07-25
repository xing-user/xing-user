package Day13.io;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ByteStream7 {
    public static void main(String[] args) throws IOException {
/*        FileReader fr = new FileReader("D:\\code\\JavaSE\\BaseVersion\\JavaSE\\src\\Day13\\io\\a.txt");
        fr.read();*/
        FileWriter fw = new FileWriter("D:\\code\\JavaSE\\BaseVersion\\JavaSE\\src\\Day13\\io\\a.txt");


        for (int i = 0; i < 8193; i++) {
            fw.write(97);

        }
        System.out.println("----------------------------");
//        fw.close();
    }
}
