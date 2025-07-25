package Day14.io.BufferdIO;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedStream {
    public static void main(String[] args) throws IOException {
        BufferedReader bfr = new BufferedReader(new FileReader("D:\\code\\JavaSE\\BaseVersion\\JavaSE\\src" +
                "\\Day13\\io\\b.txt"));
        String s;
        while ((s = bfr.readLine()) != null) {
            System.out.print(s);
        }

        bfr.close();
    }
}
