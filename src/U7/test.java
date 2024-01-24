package U7;

import java.util.*;
public class test {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();

        list.add("kevy");
        list.add("dillo");
        list.add("gavi");
        list.add("ian");
        list.add("drew");
        list.add("john");

        System.out.println (list);
        System.out.println(list.size());
        System.out.println(list.get(3));
        list.set(1, "Mr. Smith");
        list.remove(4);
        list.remove(1);
        System.out.println(list.get(2));

        System.out.println();

        boolean check = list.contains("Mr.Smith");
        if (!check){
            System.out.println("List does not contain 'Mr. Smith'");
        }

        for (String i : list){
            System.out.print(i + " ");
        }

        System.out.println();

        Collections.reverse(list);

        System.out.println(list);


    }
}