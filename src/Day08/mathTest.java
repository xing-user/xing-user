package Day08;

import javax.swing.*;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Objects;
import java.util.StringJoiner;

public class mathTest {
    public static void main(String[] args) throws CloneNotSupportedException {
/*        System.out.println(Math.abs(-11));
        System.out.println(Math.ceil(-13.45));
        System.out.println(Math.floor(-13.45));
        System.out.println(Math.round(-13.45));
        System.out.println(Math.round(-13.57));
        System.out.println(Math.max(3,- 4));
        System.out.println(Math.pow(3.0, 5.0));
        System.out.println(Math.random());*/


/*        int x=15;
        for (int i = 2; i < Math.sqrt(x); i++) {
            if(x%i==0){
                System.out.println(x/i);
            }
        }*/
/*        long start = System.currentTimeMillis();
        int count = 0;
        for (int i = 1000; i < 9999; i++) {
            int ge = i % 10;
            int shi = i / 10 % 10;
            int bai = i /10 /10 %10;
            int qian = i /10 /10/10 %10;
            double sum =Math.pow(qian,4) + Math.pow(bai,4)+ Math.pow(shi,4) + Math.pow(ge,4);
            if (sum == i){
                count++;
                System.out.println(sum);
            }
        }
        long end= System.currentTimeMillis();
        System.out.println(end-start);

//        System.exit(0);

        int[]arr ={1,2,3,4,5,6,7,10,8,9};
        int[] newArr = new int[arr.length];
        System.arraycopy(arr,3,newArr,0,3);
        System.out.println(Arrays.toString(newArr));*/

/*        Student s1 = new Student(12,"xiaoming",12);
        Student[] s = new Student[2];
        s[0]=s1;
        Preson[]  p = new Preson[1];


        System.arraycopy(s,0,p,0,1);
        Student stu = (Student)p[0];
        System.out.println(stu.getName()+" "+stu.getAge() + " " + stu.getId());*/


/*        Runtime r1 = Runtime.getRuntime();
        System.out.println(r1);
        System.out.println(r1.availableProcessors());
        System.out.println(r1.maxMemory() / 1024 / 1024 + "MB");
        System.out.println(r1.totalMemory() / 1024 / 1024 + "MB");
        System.out.println(r1.freeMemory() / 1024 / 1024 + "MB");

//        System.out.println(r1.exec("java"));
        r1.exit(0);*/

/*        String str1 = "abc";
        String stu = str1.toString();
        System.out.println(stu);*/
        int[] data = {1,2,3,4,5};
        Student s1 = new Student(12,"tain",data,12);
        System.out.println(s1);
        Student u2 = (Student) s1.clone();

        BigInteger b1 = new BigInteger("12");
        System.out.println(b1);
        System.out.println();
        System.out.println(u2);


//        if (s1.equals(s2)) {
//            System.out.println(true);
//        }else  {
////            System.out.println(false);
////        }
//        JTextField n = new JTextField("123");
//        String text = n.getText().toString();
//        JTextField m = new JTextField("123");
//        String text1 = m.getText().toString();
//        if (text1.equals(text)) {
//            System.out.println(true);
//        }else {
//            System.out.println(false);
//        }
//        StringJoiner sj = new StringJoiner(",");
//        sj.add(1+" ");
//        System.out.println(sj.toString());
    }
}
