// Logical operator

public class tut10 {
    public static void main(String[] args) {

        int a = 5;
        int b = 3;
        int c = 8;

        // && operator
        System.out.println((a > b) && (c > a)); // true
        System.out.println((a > b) && (c < a)); // false

        // || operator
        System.out.println((a < b) || (c > a)); // true
        System.out.println((a > b) || (c < a)); // true
        System.out.println((a < b) || (c < a)); // false

    }

}
