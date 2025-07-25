package day04;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
//        ArrayList<String> arr = new ArrayList<>();
//        arr.add("a");
//        arr.add("b");
//        arr.add("c");
//        System.out.println(arr.get(1));
////        add方法，size方法，
//        System.out.print("[");
//        for (int i = 0; i < arr.size(); i++) {
//            if (arr.size()-1 == i){
//                System.out.println(arr.get(i)+"]");
//            }else {
//                System.out.print(arr.get(i)+", ");
//            }
        //包装类
        ArrayList<Student> arr =  new ArrayList<>();

        Student student1 = new Student("小明", 16, 1);
        Student student2 = new Student("肖哈", 18, 2);
        Student student3 = new Student("小米", 29, 3);

        arr.add(student1);
        arr.add(student2);
        arr.add(student3);


        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) != null) {
                System.out.print("[");
                System.out.println(arr.get(i).getName() + ", " + arr.get(i).getAge() +"," + arr.get(i).getNo() +"]");
            }else {
                System.out.print("]");
            }
        }
    }
}
