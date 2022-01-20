// Taking User Input

import java.util.Scanner;

public class tut4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int x = sc.nextInt();

        if (x >= 100 && x <= 999) {
            System.out.println("It is a 3 digit number");
        } else if (x >= 10 && x <= 99) {
            System.out.println("It is a 2 digit number");
        } else if (x >= 0 && x <= 9) {
            System.out.println("It is a 1 digit number");
        } else {
            System.out.println("OUT OF RANGE!");
        }

        sc.close();
    }
}
