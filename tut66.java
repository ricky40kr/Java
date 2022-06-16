// Operations on BigInteger

import java.math.BigInteger;
import java.util.Scanner;

public class tut66 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();

        BigInteger bigInt1 = new BigInteger(a);
        BigInteger bigInt2 = new BigInteger(b);
        System.out.println(bigInt1.add(bigInt2));
        System.out.println(bigInt1.multiply(bigInt2));
        sc.close();
    }
}
