package Day11.doudizhu;

import java.util.ArrayList;
import java.util.Collections;

public class PokerGame {
    //准备牌
    public static ArrayList<String> list = new ArrayList<>();

    static {
        String[] pokeRType = {"黑桃", "红桃", "方片", "梅花"};
        String[] pokerNumber = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};

        for (String type : pokeRType) {
            for (String number : pokerNumber) {
                list.add(type + number);
            }
        }
    }

    public PokerGame() {

        //洗牌
        Collections.shuffle(list);
        //发牌
        ArrayList<String> loader = new ArrayList<>();
        ArrayList<String> play1 = new ArrayList<>();
        ArrayList<String> play2 = new ArrayList<>();
        ArrayList<String> play3 = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            if (i <= 2){
                loader.add(list.get(i));
            }

            //发三家
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

    public void showPoker(String name ,ArrayList<String> play) {
        StringBuilder sb = new StringBuilder();
        sb.append(name).append(":");
        play.forEach(str -> sb.append(str).append(" "));
        System.out.println(sb.toString());
    }
}
