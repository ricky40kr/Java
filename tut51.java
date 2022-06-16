// Output Formatting using printf

import java.util.*;

public class tut51 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("================================");
        String s = sc.next();
        int k = sc.nextInt();
        System.out.printf("%-15s%03d", s, k);
        System.out.println();
        System.out.println("================================");
        sc.close();
    }
}
