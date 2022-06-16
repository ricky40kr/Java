// mutli level inheritance
// Run time polymorphism

class Animal {
    void greets() {
        System.out.println("Hey! I am a animal!");
    }
}

class Dog extends Animal {
    void greet() {
        System.out.println("Hey! I am a dog!");
    }
}

class Husky extends Dog {
    void greets() {
        System.out.println("Hey! I am a husky!");
    }
}

class HuskyBreed extends Husky {
    void greet() {
        System.out.println("Hey! I am a siberian husky!");
    }

    void color() {
        System.out.println("I am black in color.");
    }
}

public class tut81 {
    public static void main(String[] args) {
        Dog d = new Husky();
        d.greets();
    }
}
