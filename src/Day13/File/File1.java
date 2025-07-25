package Day13.File;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class File1 {
    public static void main(String[] args) throws IOException {
        String str = "D:\\BaiduNetdiskDownload\\JavaSE\\File\\java";
        File file = new File(str);
        boolean delete = file.delete();
        System.out.println("delete:"+delete);


        /*String parent = "D:\\BaiduNetdiskDownload\\JavaSE\\File";
        String child = "java.txt";
        File file1 = new File(parent, child);

        System.out.println(file1);*/



       /* File parent1 = new File("D:\\BaiduNetdiskDownload\\JavaSE\\File");
        String child1 = "java.txt";
        File file2 = new File(parent, child1);
        System.out.println(file2);

        File file3 = new File("Test.java");
        long time = file2.lastModified();

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(sdf.format(time));
        System.out.println(file3.getPath());*/
    }
}
