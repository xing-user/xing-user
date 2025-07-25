package Day14.exercise;

import Day14.io.Teacher;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class Test5 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //创建反序列化对象
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("oos.txt"));
        //读取数据
        ArrayList<Teacher> stu = (ArrayList<Teacher>) ois.readObject();
        //遍历列表
        stu.forEach(System.out::println);
        //关闭资源
        ois.close();
    }
}
