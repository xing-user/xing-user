package Day15.webcrawl.exercise;

import Day15.webcrawl.Student;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class RandomName3 {
    public static void main(String[] args) throws IOException {

        //关联字符输入流
        BufferedReader fr = new BufferedReader(new FileReader("D:\\code\\JavaSE\\BaseVersion\\JavaSE\\src\\Day15\\webcrawl\\exercise\\try03.txt"));
        ArrayList<String> list = new ArrayList<>();
        ArrayList<Student> slist = new ArrayList<>();
        String line;
        while ((line = (fr.readLine())) != null) {
            list.add(line);
        }
        fr.close();
        list.stream().forEach(s -> {
            String[] split = s.split("-");
            slist.add(new Student(split[0], split[1], Integer.parseInt(split[2]), Double.parseDouble(split[3])));
        });
        //计算权重
        double sum = 0;
        for (int i = 0; i < slist.size(); i++) {
            double power = slist.get(i).getPower();
            sum += power;
        }

        System.out.println(sum);

        //计算每个人的权重范围占比

        for (int i = 0; i < slist.size(); i++) {
            double power = slist.get(i).getPower() / sum;
            slist.get(i).setWeight(power);

        }
        double[] power = new double[slist.size()];
        power[0] = slist.get(0).getWeight();
        for (int i = 1; i < slist.size(); i++) {
            double v = slist.get(i).getWeight() + slist.get(i - 1).getWeight();
            power[i] = v;
        }

        double num = Math.random();

        int res = -Arrays.binarySearch(power, num) - 1;
// 添加边界检查，确保索引不越界
        if (res >= slist.size()) {
            res = slist.size() - 1;
        }
        Student stu = slist.get(res);
        System.out.println(stu.getName());
    }
}
