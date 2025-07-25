package Day11.Map;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Random;

public class test3 {
    public static void main(String[] args) {

//        System.out.println(getSum(1, 2, 3, 4, 5, 5, 6));
/*        Collection<String> list = new ArrayList<>();
        Collections.addAll(list,"aaa","hajhsiao","11212");
        System.out.println(list);

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("aaa");
        list2.add("hajhsiao");
        list2.add("11212");
        System.out.println(list2);

        Collections.shuffle(list2);
        System.out.println(list2);*/

        ArrayList<String> list4 = dainMing("aaa","bbbb");
        Collections.shuffle(list4);
        Random random = new Random();
        System.out.println(list4.get(random.nextInt(list4.size())));
    }

    public static ArrayList<String> dainMing(String... args) {
        ArrayList<String> result =  new ArrayList<>();
        for (String stu : args) {
            result.add(stu);
            System.out.println(result);
        }
        return result;
    }

}
