// Using super keyword

class Animal {
    String color = "White";
    int id;

    Animal() {
        id = 10;
        // System.out.println("Animal is Created!");
    }

    void display() {
        System.out.println("I am a function of Super class");
    }
}

class Dog extends Animal {
    String color;

    Dog() {
        super();
        color = "Black";

        // System.out.println("Dog is Created!");
    }

    void display() {
        System.out.println("I am a function of Child class");
    }

    void printColor() {
        System.out.println(color);
        System.out.println(super.color);
    }
}

public class tut86 {

    public static void main(String[] args) {
        Dog d1 = new Dog();
        System.out.println(d1.id);
        System.out.println(d1.color);
        d1.printColor();

    }

}
