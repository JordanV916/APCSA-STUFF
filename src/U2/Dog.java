package U2;

public class Dog {
    public String name;
    public String breed;
    public int age;

    public Dog(String nm, String br, int ag) {
        name = nm;
        breed = br;
        age = ag;
    }
    public void bark(){
        System.out.println("Woof");
    }
}
