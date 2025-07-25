package Day13.io;

import java.io.*;

public class ByteStream8 {
    public static void main(String[] args) throws IOException {

        String path = "D:\\BaiduNetdiskDownload\\app";
        File file = new File("D:\\BaiduNetdiskDownload\\JavawebAI\\04. 后端Web基础(基础知识)");
        copyDir(file, path);

    }

    public static void copyDir(File file, String path) throws IOException {
        File[] files = file.listFiles();

        if (files != null) {
            for (File f : files) {
                if (f.isFile()) {
                    FileInputStream fis = new FileInputStream(f);
                    byte[] fisByte = fis.readAllBytes();
                    String str = f.getName();
                    FileOutputStream fos = new FileOutputStream(path + "\\" + str);
                    fos.write(fisByte);
                    fos.flush();
                    fos.close();
                    fis.close();
                } else if (f.isDirectory()) {
                    String p = path + "\\" + f.getName();
                    File dirFile = new File(p);
                    dirFile.mkdir();
                    copyDir(f, p);
                }
            }
        }
    }
}
