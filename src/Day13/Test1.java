package Day13;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {

        while (true) {
            try {
                getName();
                break;
            } catch (RuntimeException e) {
                e.printStackTrace();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        while (true) {
            try {
                getAge();
                break;
            } catch (RuntimeException e) {
                e.printStackTrace();
            }
        }
    }
    public static void getName() throws Exception {
        Scanner sc = new Scanner(System.in);

            System.out.print("请输入女朋友的姓名:");
            String name = sc.nextLine();
            if (name == null) {
                throw new RuntimeException();
            } else if (name.length()<3 || name.length()>10) {
                throw new RuntimeException();
            }else {
                System.out.println("女朋友的姓名：" + name);
            }

    }
    public static void getAge(){
        Scanner sc = new Scanner(System.in);
            System.out.println("请输入女朋友的年龄:");
            int age = sc.nextInt();
            if (age < 18|| age > 40) {
                throw new RuntimeException();
            } else {
                System.out.println("女朋友的年龄：" + age);
            }
    }
}
