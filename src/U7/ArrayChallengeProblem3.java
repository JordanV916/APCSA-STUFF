package U7;

import java.sql.SQLOutput;
import java.util.*;
import java.io.File;
import java.util.Scanner;

public class ArrayChallengeProblem3 {
    public static void main(String[] args) throws Exception {
        ArrayList<String> allWords = new ArrayList<String>();
        Scanner input = new Scanner(new File("words"));

        while (input.hasNext()) {
            String word = input.next();
            allWords.add(word);
        }
        System.out.println(allWords);

        for (String s : allWords) {
            if (s.charAt(0) == 't') {
                System.out.print(s + " ");
            }
        }
        System.out.println();
        for (String s : allWords) {
            if (s.charAt(0) == 's') {
                System.out.print(s + " ");
            }
        }

        System.out.println();

        for (int i= allWords.size()-1; i>=0; i--) {
            System.out.print(allWords.get(i)+" ");
        }

        System.out.println();
       // System.out.println(allWords.reversed());
    }
}