import java.util.*;
public class ArrayProblem5 {
    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<String>();
        a.add("Gregor Clegane");
        a.add("Khai Drogo");
        a.add("Cersei Lannister");
        a.add("Sandor Clegane");
        a.add("Tyrion Lannister");

        for (String str : a)
            System.out.println(str);
    }
}