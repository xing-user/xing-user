package Day13;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test {
    public static void main(String[] args) throws ParseException {

        int[] arr = {1, 2, 3, 4, 5, 6};
        try {
            System.out.println(arr[10]);
            System.out.println(2 / 0);
            String s = null;
            System.out.println(s.equals("abc"));
        } catch (ArrayIndexOutOfBoundsException  e) {
            System.out.println("索引越界了");
        }catch (ArithmeticException e) {
            System.out.println("除数不能为0");
        }catch (NullPointerException e){
            System.out.println("空指针异常");
        }catch (Exception e){
            e.printStackTrace();
        }

        System.out.println("看看我执行了吗？");
    }
}
