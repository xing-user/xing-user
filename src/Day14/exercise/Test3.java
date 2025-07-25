package Day14.exercise;

import java.io.*;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.function.Consumer;

public class Test3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("D:\\code\\JavaSE\\BaseVersion\\JavaSE\\src\\Day14\\exercise\\csb.txt"));

        TreeMap<Integer,String > map = new TreeMap<>();
        String line;
        while ((line = br.readLine()) != null){
            String s = line.split("\\.")[0];
//            String l = line.split("\\.")[1];
            map.put(Integer.parseInt(s),line);
        }
        br.close();
        //遍历
        map.forEach((k,v)-> System.out.println(k+v));

        BufferedWriter bf = new BufferedWriter(new FileWriter("D:\\code\\JavaSE\\BaseVersion\\JavaSE\\src\\Day14\\exercise\\rcsb.txt"));
        Set<Map.Entry<Integer, String>> entries = map.entrySet();
        entries.forEach(new  Consumer<Map.Entry<Integer, String>>(){
            @Override
            public void accept(Map.Entry<Integer, String> entry) {
                Integer key = entry.getKey();
                String value = entry.getValue();
                try {
                    bf.write(value);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                try {
                    bf.newLine();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        bf.close();
    }
}
