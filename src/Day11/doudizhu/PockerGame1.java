package Day11.doudizhu;

import java.util.*;

public class PockerGame1 {
    //准备牌盒
    public static HashMap<Integer, String> map = new HashMap<>();
    static ArrayList<Integer> list = new ArrayList<>();
    static {
        //序号
        int xuhao = 1;
        //花色
        String[] pokeRType = {"黑桃", "红桃", "方片", "梅花"};
        String[] pokerNumber = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};

        for (String string : pokerNumber) {
            for (String s : pokeRType) {
                map.put(xuhao,s+string);
                list.add(xuhao);
                xuhao++;
            }
        }
        map.put(xuhao,"小王");
        list.add(xuhao);
        xuhao++;
        map.put(xuhao,"大王");
        list.add(xuhao);

    }
    public PockerGame1() {
        //发牌
        Collections.shuffle(list);
        TreeSet<Integer> lord = new TreeSet<>();
        TreeSet<Integer> play1 = new TreeSet<>();
        TreeSet<Integer> play2 = new TreeSet<>();
        TreeSet<Integer> play3 = new TreeSet<>();

        for (int i = 0; i < list.size(); i++) {
            if (i<=2){
                lord.add(list.get(i));
            }

            if(i%3==0){
                play1.add(list.get(i));
            }else if(i%3==1){
                play2.add(list.get(i));
            }else {
                play3.add(list.get(i));
            }
        }

        //看牌
        showPoker("小民",play1);
        showPoker("小红",play2);
        showPoker("小良",play3);
    }
    public  void showPoker(String name ,TreeSet<Integer> play) {
        System.out.print(name+":");
        for(int s : play){
            String pocker = map.get(s);
            System.out.print(pocker+" ");
        }
        System.out.println();
    }
}
