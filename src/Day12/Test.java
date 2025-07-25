package Day12;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Test {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        Integer[] array = list.stream().filter(i -> i % 2 == 0).toArray(i -> new Integer[i]);

        for (Integer i : array) {
            System.out.println(i);
        }
    }
}
