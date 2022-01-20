// While loop
// To check number is palindrome or not

import java.util.Scanner;

public class tut26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        int temp = n;
        int rev_n = 0;
        sc.close();

        while (temp > 0) {
            int lastDigit = temp % 10;
            rev_n += rev_n * 10 + lastDigit;
            temp /= 10;
        }
        if (rev_n == n) {
            System.out.println(n + " is a Palindrome number.");
        } else {
            System.out.println(n + " is not a Palindrome number.");
        }
    }
}
