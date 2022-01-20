// Advance patterns

import java.util.Scanner;

public class tut23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1
        // Pyramid
        System.out.print("Enter number of rows you want : ");
        int n = sc.nextInt();

        for (int i = 0; i <= n; i++) {
            for (int j = n - i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k < i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();

        // 2
        // Right-sided Full Pyramid
        System.out.print("Enter odd number of rows you want : ");
        int m = sc.nextInt();
        for (int i = 1; i <= (m + 1) / 2; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*  ");
            }
            System.out.println("\n");
        }
        for (int k = ((m + 1) / 2) - 1; k > 0; k--) {
            for (int l = k; l > 0; l--) {
                System.out.print("*  ");
            }
            System.out.println("\n");
        }
        System.out.println();

        // 3
        // Hollow Right Triangle of stars
        System.out.print("Enter number of rows you want : ");
        int a = sc.nextInt();
        if (a <= 0) {
            System.out.println();
        } else {
            System.out.println("*");
        }
        for (int i = 2; i < a; i++) {
            System.out.print("* ");
            for (int j = 0; j < i - 2; j++) {
                System.out.print("  ");
            }
            System.out.println("*");
        }

        for (int i = 0; i < a; i++) {
            System.out.print("* ");
        }
        System.out.println();

        // 4
        // Inverted Number Pyramid
        System.out.println();
        System.out.print("Enter number of rows you want : ");
        int r = sc.nextInt();

        for (int i = 1; i <= r; i++) {
            for (int j = 0; j < i - 1; j++) {
                System.out.print(" ");
            }
            for (int k = i; k <= r; k++) {
                System.out.print(k + " ");
            }
            System.out.println();
        }
        System.out.println();

        // 5
        // Number Hour Glass
        System.out.print("Enter number of rows you want : ");
        int z = sc.nextInt();
        for (int i = 1; i <= z; i++) {
            for (int j = 0; j < i - 1; j++) {
                System.out.print(" ");
            }
            for (int k = i; k <= z; k++) {
                System.out.print(k + " ");
            }
            System.out.println();
        }
        for (int i = z - 1; i > 0; i--) {
            for (int j = 0; j < i - 1; j++) {
                System.out.print(" ");
            }
            for (int k = i; k <= z; k++) {
                System.out.print(k + " ");
            }
            System.out.println();
        }
        System.out.println();

        // 6
        // Floyd's Triangle
        System.out.print("Enter number of rows you want : ");
        int b = sc.nextInt();

        int s = 1;
        for (int i = 1; i <= b; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(s + " ");
                s += 1;
            }
            System.out.println();
        }

        sc.close();
    }
}