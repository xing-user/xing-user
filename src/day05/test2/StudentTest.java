package day05.test2;

import java.util.ArrayList;

public class StudentTest {
    public static void main(String[] args) {
        ArrayList<Student> st = new ArrayList<>();

        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();

        st.add(s1);
        st.add(s2);
        st.add(s3);

        int maxStudent = StudentUtil.getMaxStudent(st);
        System.out.println(maxStudent);
    }
}

