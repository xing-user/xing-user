package Day11.Map;

import java.util.LinkedHashMap;

public class Test2 {
    public static void main(String[] args) {
        LinkedHashMap<String,Integer> map = new LinkedHashMap<>();
        map.put("bbb",345);
        map.put("ccc",567);
        map.put("aaa",456);
        map.put("aaa",123);


        System.out.println(map);
    }
}
