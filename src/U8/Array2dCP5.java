package U8;

import java.util.Arrays;
import java.util.Scanner;

public class Array2dCP5 {
    public static void main(String args[]){
        String[][] stuScores = new String[6][5];

        char a = 'a';
        for (int i = 0; i < 5; i++) {
            stuScores[0][i] = String.valueOf(a);
            a++;
        }

        System.out.println(Arrays.deepToString(stuScores));

        Scanner scan = new Scanner(System.in);

        for (int row = 1; row < 6; row++) {
            for (int col = 0; col < 5; col++) {
                System.out.println(stuScores[0][col] + "'s' Score for Quiz #" + (row) + ": ");
                stuScores[row][col] = scan.nextLine();
            }
            System.out.println();
        }

        System.out.println(Arrays.deepToString(stuScores));

        int averageSum = 0;
        for (int col = 0; col < 5; col++) {
            for (int row = 0; row < 6; row++) {
                if (row == 0) {
                    System.out.print(stuScores[0][col] + "'s Average Score: ");
                } else {
                    averageSum += Integer.parseInt(stuScores[row][col]);
                }
            }
            System.out.println((double)averageSum / 5);
            averageSum = 0;
        }
        int colAvg = 0;
        for (int col = 0; col < 5; col++) {
            for (int row = 1; row < 6; row++) {
                colAvg += Integer.parseInt(stuScores[row][col]);
            }
            System.out.println("Col #" + col + " average: " + ((double)colAvg / 5));
            colAvg = 0;
        }

        int totAverage = 0;
        for (int row = 1; row < 6; row++) {
            for (int col = 0; col < 5; col++) {
                totAverage += Integer.parseInt(stuScores[row][col]);
            }
        }
        System.out.println("Total Average: " + (double)totAverage / 25);
    }
}