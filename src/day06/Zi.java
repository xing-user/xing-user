package day06;

public class Zi extends Fu{
    int c = 0x333;


    @Override
    public void work() {
        System.out.println(this.getAge()+this.getName()+this.getC());
    }

    public Zi() {
    }

    public Zi(String name, int age, int c) {
        super(name, age);
        this.c = c;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }
}
