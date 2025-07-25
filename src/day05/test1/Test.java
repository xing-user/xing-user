package day05.test1;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        double[] arr = {
                1.0,2.0,3.0,4.0,5.0
        };

//        String str = ArrayUtil.printArr(arr);
//        System.out.println(str);
        double avg= ArrayUtil.getAverage(arr);
        System.out.println(avg);

        ArrayList<String > list = new ArrayList<>();
        String a = "aaa";
        list.add(a);
        list.add(a);
        System.out.println(list.size());
        System.out.println(list.get(0));
        System.out.println(list.get(1));
    }


}
