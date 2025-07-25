package SpecificExercises;

public class Dog extends Animals implements swim {

    @Override
    public void swimming() {
        System.out.println("111");
    }

    public Dog() {
    }

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {

    }




    public static void printAnimals() {
        System.out.println("DW");
    }
}
