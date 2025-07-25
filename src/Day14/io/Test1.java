package Day14.io;

import java.io.*;

public class Test1 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
/*        //创建对象
        Student student = new Student("小明", 21,"南极");
        //创建序列化输出流
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("student.txt"));
        //写入持久化文件
        oos.writeObject(student);
        //关闭输出流
        oos.close();*/

        //创建反序列
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("student.txt"));
        //读取对象
        Object o = ois.readObject();
        Student o1 = (Student) o;
        System.out.println(o1);
        //关闭反序列化对象的资源
        ois.close();
    }
}
