package Day13.File;

import java.io.File;


public class File2 {
    public static void main(String[] args) {
        String str = "D:\\BaiduNetdiskDownload\\JavaSE\\File";
        File file = new File(str);
        File[] files = file.listFiles();
        for (File f : files) {
            if (f.isDirectory()) {
                deleteDir(f);
                f.delete();
            } else if (f.isFile()) {
                f.delete();
            }
        }

    }
    public static void deleteDir(File dir) {
        File[] files = dir.listFiles();
        if (files != null) {
            for (File f : files) {
                if (f.isDirectory()) {
                    deleteDir(f);
                    f.delete();
                }
                else  {
                    f.delete();
                }
            }

        }
        }

}
