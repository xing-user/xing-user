package Day14.PrintStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.Charset;

public class PrintWriter1 {
    public static void main(String[] args) throws IOException {
        //创建字符打印流的对象
        PrintWriter pw = new PrintWriter(new FileOutputStream("try2.txt"),true, Charset.forName("UTF-8"));
        //字符打印流的成员方法:write, println , print , printf
        pw.println(98);
        pw.print(true);
        pw.println();
        pw.printf("%d + %d = %d" ,1,2,3);
        //关闭资源
        pw.close();
    }
}
