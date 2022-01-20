// Array (taking user input) and also adding two Arrays to form a new Array

import java.util.Scanner;

public class tut30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of rows : ");
        int rows = sc.nextInt();
        System.out.println("Enter number of columns : ");
        int cols = sc.nextInt();

        int a[][] = new int[rows][cols];
        System.out.println("Enter Array A : ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                a[i][j] = sc.nextInt();
            }
            System.out.println();
        }

        int b[][] = new int[rows][cols];
        System.out.println("Enter Array B : ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                b[i][j] = sc.nextInt();
            }
            System.out.println();
        }

        int c[][] = new int[rows][cols];
        System.out.println("Result Array C : ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                c[i][j] = a[i][j] + b[i][j];
                System.out.print(c[i][j] + "  ");
            }
            System.out.println();
        }
        sc.close();
    }
}
