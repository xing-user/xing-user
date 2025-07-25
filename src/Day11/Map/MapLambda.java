package Day11.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class MapLambda {
    public static void main(String[] args) {
        Map<String ,String > map = new HashMap<>();
        //添加元素
        map.put("标枪","马超");
        map.put("挂件","瑶");
        map.put("龙骑士","尹志平");

        map.forEach((k,v)-> System.out.println(k+v));
    }
}
