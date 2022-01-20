// Arithematic operators

public class tut6 {
    public static void main(String[] args) {
        int a = 3;
        int b = 5;

        int c = a * a + b * b + 2 * a * b;
        System.out.println(c);

        double d = (double) b / a;
        System.out.println(d);

        int e = b % a;
        System.out.println(e);

        int f = b++;
        System.out.println(f + " " + b);

        int g = ++a;
        System.out.println(g + " " + a);
    }
}
