package Day11;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.TreeSet;

public class Test {
    public static void main(String[] args) {

        Teacher teacher = new Teacher("a", 23,89,93,10);
        Teacher teacher1 = new Teacher("b", 24,100,89,91);
        Teacher teacher3 = new Teacher("c", 17,87,100,100);

        TreeSet<Teacher> teachers = new TreeSet<>();

        teachers.add(teacher);
        teachers.add(teacher1);
        teachers.add(teacher3);

        teachers.forEach(System.out::println);




















/*        HashSet<Teacher> teachers = new HashSet<>();
        teachers.add(teacher);
        teachers.add(teacher1);
        teachers.add(teacher3);
        teachers.forEach(t->System.out.println(t.hashCode()));

        System.out.println(teachers);
        System.out.println(teacher.hashCode());
        System.out.println(teacher1.hashCode());

        System.out.println("abc".hashCode());
        System.out.println("acD ".hashCode());

        System.out.println(teachers);*/
    }
}
