package Day15.webcrawl.exercise;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class RandomName2 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new FileReader("D:\\code\\JavaSE\\BaseVersion\\JavaSE\\out\\production\\JavaSE\\try03.txt"));
        ArrayList<String> rn = new ArrayList<>();
        String str;
        while ((str=bf.readLine()) != null){
            rn.add(str);
        }

        bf.close();

        BufferedWriter bfw =new BufferedWriter(new FileWriter("D:\\code\\JavaSE\\BaseVersion\\JavaSE\\src\\Day15\\webcrawl\\exercise\\RandomName2.txt",true));

        ArrayList<String> ot =  new ArrayList<>();
        BufferedReader bfr =new BufferedReader(new FileReader("D:\\code\\JavaSE\\BaseVersion\\JavaSE\\src\\Day15\\webcrawl\\exercise\\RandomName2.txt"));
        String st;
        while ((st=bfr.readLine()) != null){
            ot.add(st);
        }
        bfr.close();

        Collections.shuffle(rn);

        if (!rn.isEmpty()) {
            String newName = rn.remove(0).split("-")[0];
            BufferedWriter bf1 = new BufferedWriter(new FileWriter("D:\\code\\JavaSE\\BaseVersion\\JavaSE\\out\\production\\JavaSE\\try03.txt"));
            for (String s : rn) {
                bf1.write(s);
                bf1.newLine();
            }
            bf.close();
            System.out.println(newName);
            ot.add(newName);
        }



        if (rn.isEmpty()) {
            for (int i = 0; i < ot.size(); i++) {
                Collections.shuffle(ot);
                System.out.println(ot.get(0));
            }
        }else{
            for (String string : ot) {
                bfw.write(string);
                bfw.newLine();
            }
            bfw.close();
        }
    }
}
