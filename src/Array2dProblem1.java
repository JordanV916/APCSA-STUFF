public class Array2dProblem1 {
    public static void main(String[] args) {
        int[][] arr = {{1,2},{3,4}};;
        int sum = 0;
        int count = 0;
        for (int row = 0; row < arr.length; row++)
            for (int col = 0; col < arr[row].length; col++) {
                count += 1;
                sum += arr[row][col];}
        {
            System.out.println("Total is " + sum);
            System.out.println("Count is "  + count);
            System.out.println("Average is " + (double)sum/count);
        }
    }
}