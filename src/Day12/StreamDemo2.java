package Day12;

import java.util.*;

import java.util.function.Function;
import java.util.stream.Collectors;


public class StreamDemo2 {
    public static void main(String[] args) {
        //单列集合
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"张三-男-22","李四-女-18","王五-男-19","赵六-男-100");
        Map<String,Integer> collect = list.stream().filter(s -> "男".equals(s.split("-")[1]))
                .collect(Collectors
                        .toMap(
                                s->s.split("-")[0],
                                s->Integer.parseInt(s.split("-")[2])
                        ));
        System.out.println(collect);


//        Stream<String> stream = list.stream();
//        stream.forEach(s->System.out.println(s));

        //双列集合

/*        HashMap<String,Integer> map = new HashMap<>();

        map.put("aaa",1);
        map.put("bbb",2);
        map.put("ccc",3);

        map.keySet().stream().forEach(s->System.out.println(s));

        map.entrySet().stream().forEach(s->System.out.println(s));*/
//        String[] st1 = {"l", "m", "n", "s", "l", "o"};
/*        String[] array = list.stream().toArray(String[]::new);
        System.out.println(Arrays.toString(array));*/
//        System.out.println(Arrays.stream(st1).count());
//        String[] st = new String[0];

        //toArray方法

/*        Arrays.stream(st).collect();*/


/*        String[] st = {"a", "bcd", "c", "d", "e", "f", "g", "h", "a"};
        System.out.println(s.split("-")[0]);
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        ;*/
//        Arrays.stream(st).filter(s->s.length()==3).forEach(System.out::println);

//        Arrays.stream(st).limit(5).forEach(System.out::print);
//        System.out.println();
//        Arrays.stream(st).skip(5).forEach(System.out::print);
//        System.out.println();
//        Arrays.stream(st).distinct().forEach(System.out::print);
//        System.out.println();

//        Stream.concat(Arrays.stream(st1),Arrays.stream(st)).distinct().forEach(s1-> System.out.print(" "+s));
//    }
//}
    }
}