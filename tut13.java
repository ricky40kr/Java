// nesting

import java.util.Scanner;

public class tut13 {
    public static void main(String[] args) {
        int b = 55;
        int c = 1;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value for variable a : ");
        int a = sc.nextInt();
        sc.close();

        if (a >= c) {
            if (a > b) {
                System.out.println("a is the greatest number among all.");
            } else if (a == b || a == c) {
                System.out.println("a is equal to b or c.");
            } else {
                System.out.println(" a is greater than c but smaller than b.");
            }
        } else {
            System.out.println("a is the smallest number among all.");
        }
    }
}
