// Function Overriding

class A {
    public void meth2() {
        System.out.println("I am method 2 of class A.");
    }
}

class B extends A {
    @Override
    public void meth2() {
        System.out.println("I am method 2 of class B.");
    }

    public void meth3() {
        System.out.println("I am method 3 of class B.");
    }
}

public class tut36b {
    public static void main(String[] args) {
        A a = new A();
        a.meth2();

        B b = new B();
        b.meth2();
    }
}
