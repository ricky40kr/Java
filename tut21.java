// Breaking loop as the user enters a negative number

import java.util.Scanner;

public class tut21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (;;) {
            System.out.print("Enter a number : ");
            int n = sc.nextInt();
            if (n < 0) {
                System.out.println(n + " is a negative number.");
                sc.close();
                break;
            } else {
                System.out.println(n + " is a positive number.");
            }
        }
    }
}
