// Star pattern 

import java.util.Scanner;

public class tut22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Half pyramid (right sided)
        System.out.print("Enter number of rows you want : ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        System.out.println();

        // Inverted half pyramid (left sided)
        System.out.print("Enter number of rows you want : ");
        int m = sc.nextInt();
        sc.close();

        for (int i = 0; i < m; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int k = m - i; k > 0; k--) {
                System.out.print("*");
            }
            System.out.println("");
        }

    }
}
