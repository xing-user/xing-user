package Day15.webcrawl.exercise;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class RandomName {
    public static void main(String[] args) throws IOException {
        BufferedReader bfr = new BufferedReader(new FileReader("D:\\code\\JavaSE\\BaseVersion\\JavaSE\\out\\production\\JavaSE\\try03.txt"));
        ArrayList<String> rn = new ArrayList<>();
        String str;
        while ((str=bfr.readLine()) != null){
            rn.add(str);
        }

        bfr.close();

        Collections.shuffle(rn);
        System.out.println(rn.get(0).substring(0,3));

    }
}
