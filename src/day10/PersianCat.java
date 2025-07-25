package day10;

public class PersianCat extends Cat {

    public PersianCat() {
    }


    @Override
    public void eat() {
        System.out.println("一只叫做" + getName() +"的," + getAge() +"的波斯猫,正在吃小饼干");
    }
}
