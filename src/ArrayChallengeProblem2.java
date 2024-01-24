import java.util.*;

public class ArrayChallengeProblem2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<String>();
        ArrayList<String> list1 = new ArrayList<String>();

        //This is like the .exe
        boolean inp = true;

        while (inp) {
            System.out.print("1#: ");
            String input = scan.nextLine();
            if (!Objects.equals(input, "quit")) {
                list.add(input);
            } else
                inp = false;
        }
        boolean inp1 = true;

        while (inp1) {
            System.out.print("2#: ");
            String input = scan.nextLine();
            if (!Objects.equals(input, "quit")) {
                list1.add(input);
            } else
                inp1 = false;
        }
        scan.close();

        System.out.println("Intersects: " + intersect(list, list1));
    }
    public static ArrayList<String> intersect(ArrayList<String> list, ArrayList<String> list1) {
        ArrayList<String> intersect = new ArrayList<String>();
        for (String s : list) {
            for (String s2 : list1) {
                if (Objects.equals(s, s2)) {
                    intersect.add(s);
                }
            }
        }
        return intersect;
    }
}