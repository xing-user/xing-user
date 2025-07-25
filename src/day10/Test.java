package day10;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        //遍历集合,调用动物的eat方法

        //要求1:该方法能养所有品种的猫,但是不能养狗;
        KeepPet();
        //要求3:该方法能养所有的动物,但是不能传递其他类型

        
    }

    private static void KeepPet() {
        ArrayList<Cat> cats = new ArrayList<Cat>();
        PersianCat psCat = new PersianCat();
        PersianCat psCat1 = new PersianCat();
        TabbyCat tbCat = new TabbyCat();

        cats.add(psCat);
        cats.add(psCat1);

        for (Cat cat : cats) {
            cat.eat();
        }

        System.out.println(cats.get(0).equals(cats.get(1)));
    }
}
