package Day11;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.function.Consumer;


public class SetDemo1 {

    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        boolean r1 = set.add("aaa");
        set.add("bbb");
        set.add("ccc");
        boolean r2 = set.add("aaa");

        System.out.println(r1);
        System.out.println(r2);

        //迭代器循环
        Iterator<String> iterator = set.iterator();

        while (iterator.hasNext()) {
            String i = iterator.next();
            System.out.println(i);
        }
        //增强for循环

        set.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });



        set.forEach(str -> System.out.println(str));

        System.out.println(set);
    }
}
