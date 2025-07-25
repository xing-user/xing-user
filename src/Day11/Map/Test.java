package Day11.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        Student stu1 = new Student("zhangsan",23);
        Student stu2 = new Student("lisi",23);
        Student stu3 = new Student("zhangsan",23);

        Map<Student,String> map = new HashMap<>();


        map.put(stu1,"hebei");
        map.put(stu2,"henan");
        map.put(stu3,"jiangxi");

        map.forEach((k,v)-> System.out.println(k+"籍贯："+v));


    }
}
