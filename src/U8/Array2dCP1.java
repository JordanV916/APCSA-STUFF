package U8;

public class Array2dCP1 {
    public static void main(String[] args) {
        String[][] colors = new String[][]{{"red", "yellow", "blue"}, {"orange", "green", "purple"}};

        for (String s : colors[0]) {
            System.out.print(s + " ");
        }
        System.out.println();
        for (String s : colors[1]) {
            System.out.print(s + " ");
        }
        System.out.println();
    }
}