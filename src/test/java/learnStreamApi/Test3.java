package learnStreamApi;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Test3 {
    public static void main(String[] args) {
        /**
         * в Treeset сортировка от меньшего к большему
         */
        Set<String> set = new TreeSet<>();
        set.add("privet");
        set.add("kak dela?");
        set.add("OK");
        set.add("poka");
        System.out.println(set);

        /**
         * с помошью стрима определили длинну слов методом map и с помошью лямбды
         */
      Set<Integer> set2 = set.stream().map(e->e.length()).collect(Collectors.toSet());
        /**
         * с помошью стрима преобразовали поток в лист
         */
      List<Integer> lis3 = set.stream().map(e->e.length()).collect(Collectors.toList());


        System.out.println("---------------------");
        System.out.println(set2);
        System.out.println("--------------------");
        System.out.println("Нет сортировки потому что преобразовано в лист " + lis3);
    }
}
