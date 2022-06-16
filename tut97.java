// Graph representaion using Matrices

import java.util.Scanner;

public class tut97 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dimension;
        int sum = 0;

        System.out.print("Enter dimensions : ");
        dimension = sc.nextInt();

        int matrix[][] = new int[dimension][dimension];

        // Taking Input
        System.out.println("Enter the value in array at :");
        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < dimension; j++) {
                System.out.print("(" + i + "," + j + ") : ");
                matrix[i][j] = sc.nextInt();
                System.out.println();
            }
        }

        // Matrix output
        System.out.println("The matrix : ");
        for (int i = 0; i < dimension; i++) {
            System.out.print("[ ");
            for (int j = 0; j < dimension; j++) {
                if (matrix[i][j] == 0) {
                    System.out.print("0 ");
                } else {
                    System.out.print("1 ");
                }
                sum += matrix[i][j];
            }
            System.out.print("]");
            System.out.println();
        }

        // Sum of all elements
        System.out.println("The sum of all elements of array : " + sum);
        sc.close();
    }
}
