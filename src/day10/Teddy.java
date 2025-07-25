package day10;

public class Teddy extends Dog{
    @Override
    public void eat() {
        System.out.println("一只叫做" + getName() +"的," + getAge() +"的泰迪,正在吃骨头,边吃边蹭");
    }
}
