public class Array2dCP3 {
    public static void main(String[] args) {
        int[][] ints = new int[5][5];
        ints[0][0] = 50;
        ints[1][2] = 11;
        ints[4][4] = 99;

        for (int row[] : ints) {
            for (int col : row) {
                System.out.print(col + " ");
            }
        }
    }
}