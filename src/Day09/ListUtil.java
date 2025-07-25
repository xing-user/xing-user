package Day09;

import java.util.ArrayList;

public class ListUtil {

    private  ListUtil() {}
    public static <E> boolean addAll(ArrayList<E> list, E e){

        list.add(e);

        return true;
    }

    public static void show(){
        System.out.println();
    }
}
