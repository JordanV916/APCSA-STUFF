package U2;

class Doggy {
  private String name;
  private String breed;
  private int age;

  Doggy(Sring nm, String br, int ag){
    name = nm;
    breed = br;
    age = ag;
    }
  public void bark(){
    System.out.print("Woof! Woof!");
    }

    public static void main(String[] args){
    Doggy maxDog = new Doggy("Max", "German Shepherd", 12);
    System.out.println("My dog's name is " +maxDog.name + ".");
    System.out.println(maxDog.name + " is a " + maxDog.breed+".");
    System.out.println(maxDog.name + " is "+maxDog.age+" years old.");
    maxDog.bark();
      }
    }
