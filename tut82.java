// abstract

abstract class Demo {
    abstract void greet();

    public void display() {
        System.out.println("Welcome to INDIA...<3");
    }

}

class Hello extends Demo {
    public void greet() {
        System.out.println("Namastae!");
    }
}

public class tut82 {
    public static void main(String[] args) {
        Hello obj = new Hello();
        obj.greet();
        obj.display();
    }
}