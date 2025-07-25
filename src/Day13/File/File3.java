package Day13.File;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;

public class File3 {
    public static void main(String[] args) {
        File file = new File("D:\\BaiduNetdiskDownload");
        HashMap<String, Integer> stringIntegerHashMap = scDir(file);
        stringIntegerHashMap.forEach((key, value) -> {
            System.out.print(key + ":" + value + " ");
        });

    }
    public static HashMap<String,Integer> scDir(File dir) {
        HashMap<String ,Integer> map = new HashMap<>();

        File[] files = dir.listFiles();

        if (files != null) {
            for (File file : files) {
                if (file.isFile()){
                    String name = file.getName();
                    String[] sufname = name.split("\\.");
                    if (sufname.length>=2){
                        String endname = sufname[sufname.length-1];
                        if(map.containsKey(endname)){
                            map.put(endname,map.get(endname)+1);
                        }else {
                            map.put(endname,1);
                        }
                    }
                }else if (file.isDirectory()){
                    HashMap<String, Integer> stringIntegerHashMap = scDir(file);
                    stringIntegerHashMap.forEach((s,integer)->{
                        if(map.containsKey(s)){
                            map.put(s,map.get(s)+stringIntegerHashMap.get(s));
                        }else  {
                            map.put(s,stringIntegerHashMap.get(s));
                        }
                    });
                }
            }
        }
        return map;
    }
}
