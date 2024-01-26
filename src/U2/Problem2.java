package U2;

import java.sql.SQLOutput;

public class Problem2 {
    public static void main(String[]args){

        Dog graceDog = new Dog("Grace", "lab", 1);
        System.out.println("My dog's name is" +graceDog.name+".");
        System.out.println(graceDog.name +" is a "+graceDog.breed);
        System.out.println(graceDog.name + " is "+graceDog.age);
    }
}
