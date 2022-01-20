// Using ternary operator for if else

public class tut12 {
    public static void main(String[] args) {
        int a = 9;
        int b = 6;
        int c = 0;

        // if (a > b) {
        // c = a;
        // } else {
        // c = b;
        // }

        // Ternary operator
        c = a > b ? a : b;
        System.out.println("Maximum of two numbers is " + c);
    }
}
