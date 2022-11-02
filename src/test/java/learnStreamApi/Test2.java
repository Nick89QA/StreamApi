package learnStreamApi;

import java.lang.reflect.Array;
import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Test2 {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Privet");
        list.add("Kak dela");
        list.add("Ok");
        list.add("poka");

        /**
         * с помошью стрима определили длинну слов методом map и с помошью лямбды
         */
       List<Integer> list2 = list.stream().map(element ->element.length()).collect(Collectors.toList());

        System.out.println(list2);

        /**
         * преобразовали поток и из потока получили масив и с помошью лямбды поделили элемент на 3
         */
        int []array = {4,3,2,5,7,8,5,2,34,444,5};
        array = Arrays.stream(array).map(element -> {
            if (element % 2 == 0) {
                element = element/3;
            }
          return element;
        }).toArray();
        System.out.println(Arrays.toString(array));

    }

}



