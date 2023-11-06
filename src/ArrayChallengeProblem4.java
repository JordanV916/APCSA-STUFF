import java.lang.reflect.Array;
import java.util.*;
import java.io.File;
import java.util.Scanner;

public class ArrayChallengeProblem4 {
    public static void main(String[] args) throws Exception {
        ArrayList<String> students = new ArrayList<String>();
        Scanner input = new Scanner(new File("students"));

        while (input.hasNext()) {
            String word = input.next();
            students.add(word);
        }

        System.out.println(students);

        Scanner scan = new Scanner(System.in);
        Scanner scan1 = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<String>();
        ArrayList<Integer> scores = new ArrayList<Integer>();

        for (int i = 0; i < students.size(); i++) {
            System.out.print("Input Score for " + (students.get(i) + ": "));
            int score = scan1.nextInt();
            scores.add(score);
        }

        System.out.println();

        for (int ns = 0; ns < students.size(); ns++) {
            System.out.print(students.get(ns) + " got a score of " + scores.get(ns));
            System.out.println();
        }

        System.out.println();

        double avgscore = 0;
        for (int i : scores) {
            avgscore += (double) i;
        }
        System.out.println("The average score was " + avgscore / scores.size() + "%");

        System.out.println();

        ArrayList<Integer> numba2 = new ArrayList<Integer>();
        numba2.

        Collections.sort(numba2);

        System.out.println("The highest score was " + (numba2.getLast()) + "%");

        System.out.println();

        System.out.println("The lowest score was " + (numba2.getFirst()) + "%");

        System.out.println();

        int score = 100;
        int count = 0;
        while(score >= 0) {
            for (int i = 0; i < scores.size(); i++) {
                if (scores.get(i) == score) {
                    count++;
                }
            }
            if (count > 0 ){
                System.out.println("The score " + score + " occured " + count +" times");
            }
            count = 0;
            score -= 1;
        }

        System.out.println();
        int i = 0;
        for (String s : students) {
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
            System.out.println(s + " got a " + letter);
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

        }
    }
