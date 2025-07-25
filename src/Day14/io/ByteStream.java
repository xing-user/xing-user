package Day14.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.function.Consumer;


public class ByteStream {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("D:\\code\\JavaSE\\BaseVersion\\JavaSE\\src\\Day13\\io\\a.txt");
        InputStreamReader isr = new InputStreamReader(fis);
        StringBuilder sb = new StringBuilder();
        int num ;
        while ((num = fis.read()) != -1) {
            sb.append((char)num);
        }
        fis.close();
        String arrStr = sb.toString();
        /*String arrStr = sb.toString();
        String[] split = arrStr.split("-");
        ArrayList<Integer> list = new ArrayList<>();
        for (String s : split) {
            Integer i = Integer.parseInt(s);
            list.add(i);
        }*/

        Integer[] array = Arrays.stream(arrStr.split("-")).map(Integer::parseInt)
                .sorted()
                .toArray(Integer[]::new);
        String replace = Arrays.toString(array).replace(", ", "-");
        replace = replace.substring(1, replace.length()-1);


/*        StringJoiner sj = new StringJoiner("-");
        for (Integer i : list) {
            sj.add(i.toString());
        }
        String string = sj.toString();*/



        FileOutputStream fos = new FileOutputStream("D:\\code\\JavaSE\\BaseVersion\\JavaSE\\src\\Day13\\io\\a.txt");

        fos.write(replace.getBytes());



        fos.close();
    }
}
