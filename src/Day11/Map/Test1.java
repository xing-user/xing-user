package Day11.Map;

import java.util.*;
import java.util.function.BiConsumer;

public class Test1 {
    public static void main(String[] args) {

        //定一个数组，用来存储景点
        String[] arr = {
                "A", "B", "C", "D"
        };

        Map<String, Integer> map = new HashMap<>();
        //统计投票总数
        ArrayList<String> list = new ArrayList<>();
        Random r = new Random();
        for (int i = 0; i < 80; i++) {
            int index = r.nextInt(arr.length);
            list.add(arr[index]);
        }
//        System.out.println(list);
        for (String s : list) {
            if (map.containsKey(s)) {
                Integer count = map.get(s);
                map.put(s, ++count);
            } else {
                map.put(s, 1);
            }
        }
        System.out.println(map);

        int max = 0;
        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            int count = entry.getValue();
            if (count > max) {
                max = count;
            }
        }
        System.out.println(max);


        //判断

        for (Map.Entry<String, Integer> entry : entries) {
            int count = entry.getValue();
            if (count == max) {
                System.out.println(entry.getKey());
            }
        }

    }
}
