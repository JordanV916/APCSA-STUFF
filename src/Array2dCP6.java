import java.util.Arrays;
public class Array2dCP6 {
    public static void main(String args[]){
        int[][] multChart = new int[10][10];

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                multChart[i][j] = (i+1) * (j+1);
            }
        }

         System.out.println(Arrays.deepToString(multChart));

        for (int row = 0; row < 10; row++) {
            for (int col = 0; col < 10; col++) {
                if (multChart[row][col] % 3 == 0 && multChart[row][col] % 5 == 0) {
                    System.out.println("FizzBuzz");
                } else if (multChart[row][col] % 5 == 0) {
                    System.out.println("Buzz");
                } else if (multChart[row][col] % 3 == 0) {
                    System.out.println("Fizz");
                } else {
                    System.out.println(multChart[row][col]);
                }
            }
        }
    }
}