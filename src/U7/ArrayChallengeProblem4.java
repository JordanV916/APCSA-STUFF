package U7;

import java.util.*;

public class ArrayChallengeProblem4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Scanner scan1 = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<String>();
        ArrayList<Integer> scores = new ArrayList<Integer>();

        boolean full = false;
        while (!full) {
            boolean quit = false;
            while (!quit) {
                System.out.print("Input a name: ");
                String name = scan.nextLine();
                if (name.equalsIgnoreCase("quit")) {
                    quit = true;
                } else {
                    names.add(name);
                    System.out.print("Input Score: ");
                    int score = scan1.nextInt();
                    scores.add(score);
                }
            }

            System.out.println();
            int i = 0;
            for (String s : names) {
                String letter = "A";
                if ((double)scores.get(i) / 100 >= 0.9F) {
                    letter = "A";
                } else if ((double)scores.get(i) / 100 >= 0.8F) {
                    letter = "B";
                } else if ((double)scores.get(i) / 100 >= 0.7F) {
                    letter = "C";
                } else if ((double)scores.get(i) / 100 >= 0.6F) {
                    letter = "D";
                } else if ((double)scores.get(i) / 100 < 0.6F) {
                    letter = "F";
                }
                System.out.print(s + " " + scores.get(i) + " " + letter + "\n");
                i++;
            }

            int total = 0;
            for (int in : scores) {
                total += in;
            }
            System.out.println("Average: " + (double)total/(scores.size()-1) + "\n");

            Collections.sort(scores);
            System.out.println("Highest: " + scores.get(scores.size()-1));
            System.out.println("Lowest: " + scores.get(0) + "\n");

            int[] occ = new int[101];
            for (int a : scores) {
                occ[a]+=1;
            }
            int o = 0;
            for (int a : occ) {
                if (a != 0) {
                    System.out.println(o + " " + a);
                }
                o++;
            }

            System.out.println("Would you like to make changes? ");
            String changes = scan.nextLine();
            if (changes.equalsIgnoreCase("yes")) {
                full = false;
            } else {
                full = true;
            }
        }
    }
}