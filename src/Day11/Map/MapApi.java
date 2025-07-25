package Day11.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapApi {

    public static void main(String[] args) {
        Map<String ,String > map = new HashMap<>();

        //添加细节
        //put方法
        //添加/覆盖
        //如果键不存在，直接添加
        //如果键存在，将value覆盖，将覆盖的value return
        map.put("郭靖","黄蓉");
        map.put("韦小宝","沐剑屏");
        map.put("小龙女","尹志平");

        Set<String> keys = map.keySet();
        keys.forEach(key -> System.out.println(map.get(key)));
/*        for (String key : keys) {
//            System.out.println(key);
            String result = key;
            String value = map.get(result);
            System.out.println(result+":"+value);
        }*/

/*
        Iterator<String> it = keys.iterator();
        while (it.hasNext()) {
            String i = it.next();
            System.out.println(map.get(i));
        }
*/

//        System.out.println(map.remove("郭靖"));
//        System.out.println(map.containsKey("\"郭靖\""));
//        System.out.println(map.containsKey("韦小宝"));

//        System.out.println(map.size());
/*        map.clear();
        System.out.println(map.isEmpty());
        System.out.println(map.containsValue("尹志平"));*/
//
//
//        System.out.println(map);




    }
}
