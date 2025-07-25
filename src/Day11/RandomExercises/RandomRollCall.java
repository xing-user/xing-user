package Day11.RandomExercises;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class RandomRollCall {
    public static void main(String[] args) {
        /*ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "a", "b", "c");
        Collections.shuffle(list);
        ArrayList<String> list2 = new ArrayList<>();
        int size = list.size();



        Random random = new Random();
        for (int i = 0; i < size; i++) {
            String name  =list.remove(0);
            System.out.print(name);
            list2.add(name);
        }
        System.out.println();
        Collections.shuffle(list2);
        int size1 = list2.size();
        for (int i = 0; i < size1; i++) {
            String name  =list2.remove(0);
            System.out.print(name);
        }*/


        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"a","b","c","d","e","f","g","h","i");
        /*Collections.shuffle(list);
        for (String s : list) {
            System.out.println(s);
        }*/

        /*Random random = new Random();
        for (int i = 0; i < list.size(); i++) {
            int index = random.nextInt(list.size());
            list.add(list.get(index));
        }*/

        int[] arr = {1,1,1,1,1,1,1,0,0,0};

        Random random = new Random();
        int index = arr[random.nextInt(arr.length)];


        String[] s = {"a","b","c","d","e","f"};
        String[] g = {"g","h","i"};

        if (index>0) {
            System.out.println(s[random.nextInt(s.length)]);
        }else  {
            System.out.println(g[random.nextInt(g.length)]);
        }










    }
}
