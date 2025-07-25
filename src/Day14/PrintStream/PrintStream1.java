package Day14.PrintStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.nio.charset.Charset;

public class PrintStream1 {
    public static void main(String[] args) throws FileNotFoundException {
        //打印流只能写出数据
        PrintStream ps = new PrintStream(new FileOutputStream("try.txt"),true, Charset.forName("UTF-8"));

        //特有方法：println,print,printf  共同的特点：都原样写出数据
        //println方法，自动刷新，自动换行
        ps.println(97);
        //print方法，不换行
        ps.print(true);
        //printf方法：带有占位符的打印语句
        ps.println();
        //%s 字符串
        ps.printf("%s爱上了%s","阿珍","阿婆");
        //关闭资源
        ps.close();
    }
}
