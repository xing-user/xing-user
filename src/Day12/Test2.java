package Day12;

import java.util.ArrayList;
import java.util.Collections;

public class Test2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"a","b","c","d","e","f","g","h","i");

        String str ="a,b,c,d,e,f,g,h,i";

        System.out.println(str.toUpperCase());
        for (String s : list) {
            s = s.toUpperCase();
            System.out.println(s);
        }
    }
}
