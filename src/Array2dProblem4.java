import java.util.Arrays;

public class Array2dProblem4 {
    public static void main(String[] args) {
        int[][] arr = new int[][]{{10, 39, 8}, {3, 35, 87}, {22, 34, 5}};

        System.out.println(arr[0][2]);
        System.out.println(arr[1][0]);
        System.out.println(arr[1][2]);
        System.out.println(arr[2][1]);

        System.out.println(Arrays.deepToString(arr));
        System.out.println("39 + 87 = " + (arr[0][1] + arr[1][2]));

        arr[0][2] = 12;
        arr[1][0] = 44;
        arr[1][2] = 25;
        arr[2][1] = 29;
    }
}