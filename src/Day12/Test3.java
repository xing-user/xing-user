package Day12;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.IntFunction;

public class Test3 {
    public static void main(String[] args) {

        ArrayList<Student> list = new ArrayList<>();
        Student s1 = new Student("张三",23);
        list.add(s1);
        String[] array = list.stream().map(Student::toString).toArray(String[]::new);

        for (String s : array) {
            System.out.println(s);
        }

    }
}
