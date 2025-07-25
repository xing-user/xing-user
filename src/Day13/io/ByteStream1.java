package Day13.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class ByteStream1 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fis = new FileOutputStream("src\\Day13\\io\\b.txt",true);

        String str = "张三";
        byte[] bytes = str.getBytes();
        String wter ="\r";
        byte[] bytes2 = wter.getBytes();
        String st = "你好";
        byte[] bytes3 = st.getBytes();
        fis.write(bytes,0,bytes.length);
        fis.write(bytes2);
        fis.write(bytes3);
        fis.close();
    }
}
