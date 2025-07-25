package Day09;

import java.util.*;


public class Test {

    public static void main(String[] args) {
//        Integer[] n= {6,2,3,1,3};
//        Arrays.sort(n, ( o1, o2)-> o1 -o2
//        );
//        System.out.println(Arrays.toString(n));

/*        Integer i = 1;
        Collection<String> col = new ArrayList();
        col.add("aaa");
        Iterator it = col.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            System.out.println(str);*/


/*        Collection<String> strings = new ArrayList<>();
        strings.add("a");
        strings.add("b");
        strings.add("c");
        for (String s : strings) {
            System.out.print(s);
        }
        System.out.println();
        strings.forEach(s -> System.out.print(s));*/


/*        List<String> list = new ArrayList<>();
        list.add("a");
        System.out.println(list);
        list.clear();
        System.out.println(list);
        list.add("b");
        System.out.println(list);

        System.out.println(list.set(0,"s"));

        int a =-100;
        System.out.println(a>>>1);*/

/*        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("a");
        System.out.println(linkedList);*/



        /*MyArrayList<String> ma =  new MyArrayList<>();
        ma.add("a");
        ma.get(0);
        System.out.println(ma);*/


        ArrayList<String> arrayList = new ArrayList();
        ListUtil.addAll(arrayList,"aaa");
        System.out.println(arrayList);
        System.out.println(Math.round(-1.6));

    }
}

