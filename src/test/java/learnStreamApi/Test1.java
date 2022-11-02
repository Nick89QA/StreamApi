package learnStreamApi;

import java.util.ArrayList;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Privet");
        list.add("Kak dela");
        list.add("Ok");
        list.add("poka");

        /**
         * c помошью цикла определим длинну слов
         */
        for (int i = 0;i < list.size();i++){
            list.set(i, String.valueOf(list.get(i).length()));
        }

        System.out.println(list);
    }
}
