// Interface

interface Bicycle {
    int a = 45; // constant value and can't be changed in main but can be changed in child class

    void applyBreak(int d);

    void speedUp(int i);
}

class FireFox implements Bicycle {
    int b = 50;

    void blowHorn() {
        System.out.println("Pee Pee Pee...");
    }

    // Methods of interface must be public at the time of implementation
    public void applyBreak(int d) {
        b = b - d;
        System.out.println("Applying Break...");
    }

    public void speedUp(int i) {
        b = b + i;
        System.out.println("Speeding Up...");
    }
}

public class tut46 {
    public static void main(String[] args) {
        FireFox a1 = new FireFox();

        a1.applyBreak(5);
        System.out.println(Bicycle.a);

        a1.speedUp(20);
        System.out.println(a1.b);

        a1.applyBreak(5);
        System.out.println(a1.b);

        a1.blowHorn();
    }
}
