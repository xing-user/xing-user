package SpecificExercises;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Animals d = new Dog();
        swim f = new Frog();

        new swim(){
          @Override
          public void swimming() {
              System.out.println("Dog");
          }
        };
        new Animals(){
          @Override
          public void eat() {
              System.out.println("重写了方法体");
          }
        };
//
//        Rabbit r = new Rabbit();
//        r.eat();
//
//        Scanner sc = new Scanner(System.in);
//        sc.nextLine();

//        ArrayList list = new ArrayList();
//        list.add(1);
//        list.add("2");
//        System.out.println(list.get(0));
//        System.out.println(list.get(1));

    }
}
