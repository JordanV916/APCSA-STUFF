import java.util.ArrayList;
import java.util.Collections;

public class testpt2 {
    public static void main(String[]args){
        ArrayList<Integer> list = new ArrayList<Integer>();

        list.add(1);
        list.add(16);
        list.add(15);
        list.add(14);
        list.add(11);
        list.add(13);
        list.add(12);

        int sum = 0;
        for (int i : list){
            sum+=i;
        }
        System.out.println(sum);

        int avg = sum / list.size();

        System.out.println(avg);

        Collections.sort(list);

        System.out.println(list.get(0));

        System.out.println(list.get(list.size()-1));

        System.out.println(list);

    }
}
