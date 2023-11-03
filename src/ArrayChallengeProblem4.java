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
            avgscore += (double)i;
        }
        System.out.println("The average score was " + avgscore/scores.size());


    }
}
