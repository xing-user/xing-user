package Day14.exercise;


import Day14.io.Teacher;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Test {
    public static void main(String[] args) throws IOException {
        Teacher teacher1 = new Teacher("小花",13,"北京");
        Teacher teacher2 = new Teacher("小名",13,"天津");
        Teacher teacher3 = new Teacher("小李",13,"河北");
        //存多个对象时存在列表里
        ArrayList<Teacher> teachers = new ArrayList<Teacher>();
        teachers.add(teacher1);
        teachers.add(teacher2);
        teachers.add(teacher3);
        //创建序列化资源
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("oos.txt"));
        //进行序列化
        oos.writeObject(teachers);
        //关闭资源；
        oos.close();
    }
}
