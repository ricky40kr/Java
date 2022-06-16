// Checking the entered input is acceptance by different primitive data types

import java.util.*;

public class tut52 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            long x = sc.nextLong();
            System.out.println(x + " can be fitted in:");
            // Conditions
            if (x >= -128 && x <= 127)
                System.out.println("* byte");
            if (x >= -Math.pow(2, 15) && x <= Math.pow(2, 15) - 1)
                System.out.println("* short");
            if (x >= -Math.pow(2, 31) && x <= Math.pow(2, 31) - 1)
                System.out.println("* int");
            if (x >= -Math.pow(2, 63) && x <= Math.pow(2, 63) - 1)
                System.out.println("* long");
        } catch (Exception e) {
            System.out.println(sc.next() + " can't be fitted anywhere.");
        }

        sc.close();
    }
}
