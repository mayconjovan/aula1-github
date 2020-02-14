package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Listas {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Maria");
        list.add("Alex");
        list.add("Bob");
        list.add("Ana");
        list.add(2, "Marco");
        System.out.println(list.size());

        for (String x : list) {
            System.out.println(x);
        }
        System.out.println("------------");
        //list.removeIf(x -> x.charAt(0) != 'M');
        System.out.println(list);
        System.out.println("------------");
        System.out.println("Index of Bob: " + list.indexOf("Bob"));
        List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
        System.out.println("Result: " + result);
        System.out.println("---------------");
        String name = list.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);
        System.out.println("Nome: " + name);
        
    }

}
