package Day11.RandomExercises;

import java.util.*;

public class Province {
    public static void main(String[] args) {
        Map<String, ArrayList<String>> map = new HashMap<>();
        ArrayList<String> l1 = new ArrayList<>();
        ArrayList<String> l2 = new ArrayList<>();
        ArrayList<String> l3 = new ArrayList<>();

        Collections.addAll(l1, "南京市", "扬州市", "苏州市", "无锡市", "常州市");
        Collections.addAll(l2, "武汉市", "孝感市", "十堰市", "宜昌市", "鄂州市");
        Collections.addAll(l3, "石家庄市", "唐山市", "邢台市", "保定市", "张家口市");

        map.put("江苏省", l1);
        map.put("湖北省", l2);
        map.put("河北省", l3);

        map.forEach((s, list) -> {
            StringJoiner builder = new StringJoiner(",","","");
            list.forEach(s1-> builder.add(s1));
            System.out.println(s + "=" + builder.toString());
        });
    }
}
