// Types of Constructors

class C {
    public double x, y, r;

    // Default constructor
    public C() {
        x = 1.2;
        y = 9;
        r = 96;
    }

    // Parameterised constructor
    public C(double x1, double y1, double r1) {
        x = x1;
        y = y1;
        r = r1;
    }

    // Copy Construct
    public C(C c1) {
        x = c1.x;
        y = c1.y;
        r = c1.r;
    }

    public double circumference(double r) {
        return 2 * 3.14 * r;
    }

    public double area(double r) {
        return 3.14 * r * r;
    }
}

public class tut87 {

    public static void main(String[] args) {

        C obj1 = new C();
        System.out.println("The default value for radius :" + obj1.r);

    }

}
