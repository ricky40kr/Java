// Abstract Class and Method

abstract class Parent{
    public Parent(){
        System.out.println("This is a counstructor.");
    }

    public void sayHello(){
        System.out.println("Hello");
    }

    abstract public void greet();

}

class Child extends Parent{
    @Override
    public void greet(){
        System.out.println("Good Morning!");
    }
}

abstract class Child2 extends Parent{
    public void Th(){
        System.out.println("I am good.");
    }
}
public class tut45 {
    public static void main(String[] args) {
        // Parent p = new Parent();    //error

        // Child2 C2 = new Child();    //error

        Child C = new Child();
        C.greet();
    }
}
