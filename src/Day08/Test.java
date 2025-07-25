package Day08;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test {
    public static void main(String[] args) throws ParseException {
        Date date = new Date();
        System.out.println(date);

        //打印指定时间
        Date d1 = new Date();
//        d1.setTime(1000L);
//        System.out.println(d1);

        String str = "2020-02-22 23:45:56";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date time = sdf.parse(str);
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒 EE");
        String time1 = sdf1.format(d1);
        System.out.println(time);
    }



}
