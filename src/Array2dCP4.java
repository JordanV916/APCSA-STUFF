

import java.util.*;

public class Array2dCP4 {
    public static void main(String[] args) {
        int[][] arr = new int[][]{{1,6,3,3,5,1}, {4,1,2,3,3,6}, {2,2,4,3,5,1}, {1,2,4,3,1,2}};
        System.out.println(Arrays.deepToString(arr));

        int sum = 0;
        for (int row = 0; row < 4; row++) {
            for (int col = 0; col < 6; col++) {
                sum += arr[row][col];
            }
        }
        System.out.println("Sum: " + sum);

        int colSum = 0;
        for (int col = 0; col < 6; col++) {
            for (int row = 0; row < 4; row++) {
                colSum += arr[row][col];
            }
            System.out.println("Sum of Col #" + col + ": " + colSum);
            colSum = 0;
        }

        System.out.println();
        int rowSum = 0;
        for (int row = 0; row < 4; row++) {
            for (int col = 0; col < 6; col++) {
                rowSum += arr[row][col];
            }
            System.out.println("Sum of Row #" + row + ": " + rowSum);
            rowSum = 0;
        }

        int threeCount = 0;
        for (int row = 0; row < 4; row++) {
            for (int col = 0; col < 6; col++) {
                if (arr[row][col] == 3) {
                    threeCount++;
                }
            }
        }
        System.out.println("\n# of 3 Occurences: " + threeCount);
        System.out.println("Max: " + getMaxValue(arr));
        System.out.println("Min: " + getMinValue(arr));

    }

    public static int getMaxValue(int[][] numbers) {
        int maxValue = numbers[0][0];
        for (int j = 0; j < numbers.length; j++) {
            for (int i = 0; i < numbers[j].length; i++) {
                if (numbers[j][i] > maxValue) {
                    maxValue = numbers[j][i];
                }
            }
        }
        return maxValue;
    }

    public static int getMinValue(int[][] numbers) {
        int minValue = numbers[0][0];
        for (int j = 0; j < numbers.length; j++) {
            for (int i = 0; i < numbers[j].length; i++) {
                if (numbers[j][i] < minValue ) {
                    minValue = numbers[j][i];
                }
            }
        }
        return minValue ;
    }
}