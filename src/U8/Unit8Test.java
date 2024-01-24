package U8;

public class Unit8Test {
    public static void main(String[]args){

        int[][] arr = {{2,2,6,5,5},{6,3,2,1,1},{4,2,3,6,5},{2,5,1,6,6}};
        int total = 0;
        int numberFiveFound = 0;
        int rowTotal = 0;
        int colTotal = 0;
        int largestValue = arr[0][0];

        for(int[] col : arr){
            for(int row : col){
                System.out.print(row + " ");
                total += row;
                if(row == 5){
                    numberFiveFound++;

                }
                if(row > largestValue){
                    largestValue = row;
                }
            }
        }

        System.out.println();
        System.out.println("Total of the array: " + total);
        System.out.println("Number 5 found " + numberFiveFound + " times.");
        System.out.println("Largest value of the array: " + largestValue);
        System.out.println();


        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                rowTotal += arr[i][j];
            }
            System.out.println("Row " + i + " total: " + rowTotal);
            rowTotal = 0;
        }
        System.out.println();


        for(int col = 0; col < arr[0].length; col++){
            for(int[] num : arr){
                colTotal += num[col];
            }
            System.out.println("Column " + col + " total: " + colTotal);
            colTotal = 0;
        }
    }
}

