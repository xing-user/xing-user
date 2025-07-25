package Day09;

import javax.xml.crypto.Data;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class CalendarTest {
    public static void main(String[] args) {
        //获取Calendar对象
        Calendar time = Calendar.getInstance();
        Date time1 = time.getTime();
        System.out.println(time);

//        time.setTime();
        //创建DAte对象
        Date d1 = new Date(0L);
//        System.out.println(d1);
//        d1.setTime(0L);
        time.setTime(d1);
        System.out.println(time.getTime());
        Instant is =  Instant.now();
        System.out.println(is);

    }
}
