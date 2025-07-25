package day04;

import java.util.StringJoiner;

public class StringDemo {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        String res = demo(arr);
        System.out.println(res);
    }
    public static String demo(int[] arr){
        StringJoiner sb = new StringJoiner(",","[","]");
        for (int i = 0; i < arr.length; i++) {
            sb.add(String.valueOf(arr[i]));
        }
        String result = sb.toString();
        return result;
    }
}
