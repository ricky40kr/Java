// if-else

import java.util.Scanner;

public class tut11 {
    public static void main(String[] args) {
        System.out.println("Enter age : ");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        if (age >= 17) {
            System.out.println("You are eligible to vote.");
        } else {
            System.out.println("You are not eligible to vote.");
        }
        sc.close();
    }
}
