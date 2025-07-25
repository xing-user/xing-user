package Day15.webcrawl.exercise;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class RandomName1 {
    public static void main(String[] args) throws IOException {
        BufferedReader bfr = new BufferedReader(new FileReader("D:\\code\\JavaSE\\BaseVersion\\JavaSE\\out\\production\\JavaSE\\try03.txt"));
        ArrayList<String> boy = new ArrayList<>();
        ArrayList<String> girl = new ArrayList<>();
        String str;
        for (int i = 0; i < 10; i++) {
            boy.add(bfr.readLine());
        }
        for (int i = 0; i < 10; i++) {
            girl.add(bfr.readLine());
        }

        bfr.close();

        int[] index = {1,1,1,1,1,1,1,0,0,0};
        Random rand = new Random();
        ArrayList<String> boyCount = new ArrayList<>();
        ArrayList<String> girlCount = new ArrayList<>();
        for (int i = 0; i < 1000000; i++) {
            int num = rand.nextInt(index.length);
            if (index[num] == 0){
                Collections.shuffle(girl);
                girlCount.add(girl.get(0));
            }else if (index[num] == 1){
                Collections.shuffle(boy);
                boyCount.add(boy.get(0));
            }
        }
        System.out.println(boyCount.size());
        System.out.println(girlCount.size());
    }
}
