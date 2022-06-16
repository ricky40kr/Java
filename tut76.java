// Types of constructor

class C {
    public double x, y, r;

    // default constructor
    public C() {
        x = 1.2;
        y = 9;
        r = 96;
    }

    // Paramaterized constructor
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

public class tut76 {
    public static void main(String[] args) {

        // default
        C obj1 = new C();
        System.out.println("The default value for radius :" + obj1.r);
        System.out.println("The circumference of circle : " + obj1.circumference(obj1.r));
        System.out.println("The area of circle : " + obj1.area(obj1.r));

        // Paramaterized
        C obj2 = new C(1.23, 4.56, 6);
        System.out.println("The circumference of circle : " + obj2.circumference(obj2.r));
        System.out.println("The area of circle : " + obj2.area(obj2.r));

        // Copy
        C obj3 = new C(obj2);
        System.out.println("The circumference of circle : " + obj3.circumference(obj3.r));
        System.out.println("The area of circle : " + obj3.area(obj3.r));

    }

}
