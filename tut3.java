// Typecasting

public class tut3 {
    public static void main(String[] args) {

        // Auto Typecasting
        int x = 5;
        float y = x;
        double z = x;
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);

        // Manual(Narrowing)
        double a = 5.63245896;
        int b = (int) a;
        float c=(float) a;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
