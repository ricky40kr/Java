// Pass By Value (only for primitive data type)

public class tut37 {
    public static void main(String[] args) {
        int c = 14;
        int d = 10;

        System.out.println(c + " " + d);
        swap(c, d);
        System.out.println(c + " " + d);
    }

    static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        // swapped
        System.out.println(a + " " + b);
        a += 5;
        b += 10;
        System.out.println(a + " " + b);
    }
}