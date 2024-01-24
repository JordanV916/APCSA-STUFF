package U8;

public class Array2dProblem3 {
    public static int getTotalForRow(int row, int[][] a) {
        int total = 0;
        for (int col = 0; col < a[0].length; col++) {
            total = total + a[row][col];
        }
        return total;
    }
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3}, {4,5,6}, {7,8,9}};
        System.out.println(getTotalForRow(0, matrix));
        System.out.println(getTotalForRow(1, matrix));
        System.out.println(getTotalForRow(2, matrix));
    }
}