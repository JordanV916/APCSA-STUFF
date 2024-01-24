package U7;

import java.util.*;

public class ArrayChallengeProblem1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }

        System.out.println("Length: " + returnLength(list));
        System.out.println("Sum: " + sum(list));
        System.out.println("Average: " + average(list));
        System.out.println("Evens: " + evens(list));
        System.out.println("Odds: " + odds(list));
        System.out.println("Small: " + small(list));
        System.out.println("Large: " + large(list));
        System.out.println("Sorted: " + sorted(list));
    }

    public static int returnLength(ArrayList<Integer> list) {
        return list.size();
    }
    public static int sum(ArrayList<Integer> list) {
        int sum = 0;
        for (int i : list)
            sum+=i;
        return sum;
    }
    public static double average(ArrayList<Integer> list) {
        return (double)sum(list)/list.size();
    }
    public static String evens(ArrayList<Integer> list) {
        ArrayList<Integer> evens = new ArrayList<Integer>();
        for (int i : list) {
            if (i % 2 == 0) {
                evens.add(i);
            }
        }
        String str = "";
        for (int i : evens) {
            str += i + " ";
        }
        return str;
    }
    public static String odds(ArrayList<Integer> list) {
        ArrayList<Integer> odds = new ArrayList<Integer>();
        for (int i : list) {
            if (i % 2 == 1) {
                odds.add(i);
            }
        }
        String str = "";
        for (int i : odds) {
            str += i + " ";
        }
        return str;
    }
    public static int small(ArrayList<Integer> list) {
        Collections.sort(list);
        return list.get(0);
    }
    public static int large(ArrayList<Integer> list) {
        Collections.sort(list);
        return list.get(list.size()-1);
    }
    public static String sorted(ArrayList<Integer> list) {
        Collections.sort(list);
        String str = "";
        for (int i : list) {
            str += i;
        }
        return str;
    }
}