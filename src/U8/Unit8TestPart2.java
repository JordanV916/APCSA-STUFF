package U8;

public class Unit8TestPart2 {
    public static void main(String[] args) {
        int[][] arr = {{7, 10, 4, 9}, {11, 12, 5, 8}, {1, 3, 2, 6}};
        System.out.println(arr[1][3] + " " + arr[1][0]);
        System.out.println(arr[0][1] + arr[1][1]);
        System.out.println(arr[2][3] - arr[1][0]);
        System.out.println(arr[0][0] * arr[2][2]);
        System.out.println(arr[2][1] / arr[0][3]);
        arr[1][1] = 17;
        arr[2][2] = 13;
        System.out.println("Total of the array: " + getTotalForLoop(arr));
        System.out.println("Average of the array: " + getAverageForEachLoop(arr));
    }

    public static int getTotalForLoop(int[][] array) {
        int total = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                total += array[i][j];
            }
        }
        return total;
    }

    public static double getAverageForEachLoop(int[][] array) {
        int count = 0;
        int total = 0;
        for (int[] i : array) {
            for (int j : i) {
                total += j;
                count++;

            }
        }
        return (double) total / count;
    }
}