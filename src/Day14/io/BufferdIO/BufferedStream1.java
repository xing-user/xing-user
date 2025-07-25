package Day14.io.BufferdIO;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedStream1 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bfw = new BufferedWriter(new FileWriter("D:\\code\\JavaSE\\BaseVersion\\JavaSE\\src" +
                "\\Day14\\io\\BufferdIO\\b.txt",true));

        String s = "nisakss";

        bfw.write(s);
        bfw.newLine();

        String s1 = "1213";
        bfw.write(s1);

        bfw.close();


    }
}
