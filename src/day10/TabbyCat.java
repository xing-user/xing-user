package day10;

public class TabbyCat extends Cat {

    @Override
    public void eat() {
        System.out.println("一只叫做" + getName() +"的," + getAge() +"的狸花猫,正在吃鱼");
    }
}
