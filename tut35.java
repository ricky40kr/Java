// Classes

class Cat {
    boolean hasFur;
    String color, breed;
    int legs, eyes;

    public void walk() {
        System.out.println("Cat is walking");
    }

    public void eat() {
        System.out.println("Cat is eating");
    }

    public void description() {
        System.out.println("my cat has " + legs + " legs and " + eyes + " eyes");
    }
}

class Dog {
    String breed, name;

    public void jump() {
        System.out.println("my dog " + name + " jumped");
    }

    public void description() {
        System.out.println("my dog's name is " + name + " and it's breed is " + breed);
    }
}

public class tut35 {
    public static void main(String[] args) {
        Cat cat1 = new Cat();

        cat1.walk();

        cat1.eyes = 2;
        cat1.legs = 4;
        cat1.description();

        Dog husky = new Dog();

        husky.breed = "Siberian Husky";
        husky.name = "Browny";

        husky.jump();
        husky.description();
    }
}