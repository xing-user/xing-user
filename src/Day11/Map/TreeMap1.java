package Day11.Map;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.TreeMap;
public class TreeMap1 {
    public static void main(String[] args) {

        /*Map<Integer, String> map = new TreeMap<>((o1, o2) ->{return o2 - o1;});

        map.put(2, "li");
        map.put(1, "pingguo");
        map.put(3, "lizhi");

        System.out.println(map);*/

        String str = "aababcabcdabcde";
        Map<Character, Integer> map = new TreeMap<>();
        for (int i = 0; i < str.length(); i++) {
            if (map.containsKey(str.charAt(i))) {
                int count = map.get(str.charAt(i));
                count++;
                map.put(str.charAt(i), count);
            } else {
                map.put(str.charAt(i), 1);
            }
        }
        map.forEach((c, i) -> System.out.print(c + "(" + i + ")"));


        LinkedList<String> list = new LinkedList<>();
        list.add("a");



    }
}
