package day05.test2;

import java.util.ArrayList;

public class StudentUtil {
    private StudentUtil() {
    }

    public static int getMaxStudent(ArrayList<Student> students) {
        int max = students.get(0).getAge();
        for (int i = 1; i < students.size(); i++) {
            int tempAge = students.get(i).getAge();
            if (tempAge > max) {
                max = tempAge;
            }
        }
        return max;
    }
}
