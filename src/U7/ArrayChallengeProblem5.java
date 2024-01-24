package U7;

import java.lang.reflect.Array;
import java.util.*;
import java.util.Scanner;

public class ArrayChallengeProblem5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Scanner scan1 = new Scanner(System.in);
        ArrayList<String> people = new ArrayList<String>();

        people.add("jordan");
        people.add("check");
        System.out.print("Welcome to L&L Bank. If you are a new user, " +
                "please say 'new'. For existing users, please say 'existing': ");

        String check = scan.nextLine();
        if (check.equalsIgnoreCase("new")) {
            System.out.print("State your name: ");
            String newperson = scan.nextLine();
            people.add(newperson);
        } else if (check.equalsIgnoreCase("existing")) {
            System.out.print("State your name: ");
            String existingperson = scan.nextLine();
            for (int i = people.size() - 1; i >= 0; i--) {
                if (people.get(i).equals(existingperson)) {
                    System.out.println("worked");
                }


            }
        }
    }
}
       // else if (check.equalsIgnoreCase("existing")) {
        //System.out.print("State your name: ");
        //String existingperson = scan.nextLine();
        //if (people.get(1).equals(existingperson)) {
        //System.out.println();
       // }