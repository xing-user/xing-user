package day04;

import java.util.Random;
import java.util.Scanner;

public class DoubleColorBall {
    public static void main(String[] args) {
        int[] lucky = Ball();
        int[] guess = guessBall();
        prize(lucky, guess);
    }

    //中奖号码生成
    public static int[] Ball() {
        int[] ball = new int[7];
        //红球随机数
        Random random = new Random();
        for (int i = 0; i < ball.length - 1; ) {
            int temp = random.nextInt(33) + 1;
            if (!Judgment(ball, temp)) {
                ball[i] = temp;
                i++;
            }
        }
        //蓝球随机数
        ball[ball.length - 1] = random.nextInt(16) + 1;
        return ball;
    }

    public static boolean Judgment(int[] arr, int num) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == num) {
                return true;
            }
        }
        return false;
    }

    //用户输入猜奖号码
    public static int[] guessBall() {
        Scanner sc = new Scanner(System.in);
        int[] guessball = new int[7];
        //输入红球号码
        for (int i = 0; i < 6; ) {
            System.out.println("请输入第" + (i + 1) + "个红球号码：");
            int temp = sc.nextInt();
            if (temp > 0 && temp <= 33) {
                if (!Judgment(guessball, temp)) {
                    guessball[i] = temp;
                    i++;
                } else {
                    System.out.println("输入的数据重复了");
                }
            } else {
                System.out.println("输入不合法");
            }
        }
        //输入蓝球号码
        System.out.println("请输入蓝球的号码:");
        int temp = sc.nextInt();
        while (true) {
            if (temp > 0 && temp <= 16) {
                guessball[guessball.length - 1] = temp;
                break;
            } else {
                System.out.println("输入不合法");
            }
        }

        return guessball;
    }

    //判断是否中奖
    public static void prize(int[] Ball, int[] guessball) {
        //遍历并统计有多少相同的数量
        int count;
        //判断蓝球中没中
        if (Ball[Ball.length - 1] == guessball[guessball.length - 1]) {
            //中了
            count = count(Ball, guessball);
            switch (count) {
                case 4 -> System.out.println("五等奖：200元");
                case 5 -> System.out.println("四等奖：3000元");
                case 6 -> System.out.println("二等奖：1000万元");
            }
        } else {
            count = count(Ball, guessball);
            switch (count) {
                case 0, 1, 2 -> System.out.println("六等奖：5元");
                case 3 -> System.out.println("五等奖：10元");
                case 4 -> System.out.println("四等奖：200元");
                case 5 -> System.out.println("三等奖：3000元");
                case 6 -> System.out.println("一等奖：1000万元");
            }
        }
    }

    //红球中了几个
    public static int count(int[] Ball, int[] guessball) {
        int count = 0;
        for (int i = 0; i < guessball.length - 1; i++) {
            for (int j = 0; j < Ball.length - 1; j++) {
                if (Ball[j] == guessball[i]) {
                    count++;
                }
            }
        }
        return count;
    }

}
