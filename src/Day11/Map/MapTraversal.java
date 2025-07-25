package Day11.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;

public class MapTraversal {
    public static void main(String[] args) {
        Map<String ,String > map = new HashMap<>();
        //添加元素
        map.put("标枪","马超");
        map.put("挂件","瑶");
        map.put("龙骑士","尹志平");


        Set<Map.Entry<String, String>> entry = map.entrySet();

        for (Map.Entry<String, String> s : entry) {
            String key = s.getKey();
            String value = s.getValue();
            System.out.println(key + "=" + value);
        }

    }
}
