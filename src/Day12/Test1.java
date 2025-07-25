package Day12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.function.IntFunction;

public class Test1 {
    public static void main(String[] args) {
        /*ArrayList<String> arrayList = new ArrayList();
        Collections.addAll(arrayList, "zhangsan, 23","lisi, 24","wangwu, 25");

        Map<String,Integer> map=arrayList.stream().filter(s -> (Integer.parseInt(s.split(", ")[1])>=24)).
                collect(Collectors.toMap(n -> n.split(", ")[0], n -> Integer.parseInt(n.split(", ")[1])));

        System.out.println(map);*/

        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "张三,12","李四,13","王五,13");
        Student[] array = list.stream().map(Student::new).toArray(Student[]::new);
        Arrays.stream(array).forEach(System.out::println);


    }
}
