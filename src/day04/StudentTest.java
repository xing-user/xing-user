package day04;

import java.util.Scanner;

public class StudentTest {
    public static void main(String[] args) {
        //定义一个长度为3的数组
        Student[] arr = new Student[3];

        Student student1 = new Student("小明", 16, 1);
        Student student2 = new Student("肖哈", 18, 2);
        Student student3 = new Student("小米", 29, 3);

//      添加到数组中
        arr[0] = student1;
        arr[1] = student2;
        arr[2] = student3;
        Student[] newArr = arr;

//      添加学生对象
        newArr = create(arr);
//      遍历学生信息
        print(newArr);
    }


    public static Student[] create(Student[] arr) {
        //1.再次添加一个学生对象
        while (true) {
            Student student = new Student();
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入学生的name:");
            student.setName(sc.next());
            System.out.println("请输入学生的age:");
            student.setAge(sc.nextInt());
            System.out.println("请输入学生的no:");
            student.setNo(sc.nextInt());

            //添加学号进行唯一性判断
            boolean flag = check(arr, student);
            if (!flag) {
                int count = 0;
                for (int i = 0; i < arr.length; i++) {
                    if (arr[i] != null) {
                        count++;
                    }
                }
                //判断空间是否足够
                if (count == arr.length) {
                    System.out.println("已经满了");
                    return creataArray(arr, count, student);
                } else {
                    arr[count] = student;
                    return arr;
                }
            } else {
                System.out.println("学号重复了，请重新输入:");
            }
        }
    }

    //创建新数组存放对象
    public static Student[] creataArray(Student[] arr,int count,Student  student) {
        Student[]  students = new Student[count];
        for (int i = 0; i < arr.length; i++) {
            students[i] = arr[i];
        }
        students[count-1] = student;
        return students;
    }

    public static boolean check(Student[] arr, Student student) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getNo() == student.getNo()) {
                return true;
            }
        }
        return false;
    }
    //遍历数组中学生信息
    public static void print(Student[] arr) {
        for (int i = 0; i < arr.length; i++) {
            Student stu = arr[i];
            if (stu != null) {
                System.out.print(arr[i].getName() + " " + arr[i].getAge() + " " + arr[i].getNo());
            }
        }
    }
}
