// While loop
// Sum of Digits

import java.util.Scanner;

public class tut24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        int temp = n;
        int sum = 0;
        sc.close();

        while (temp > 0) {
            int lastDigit = temp % 10;
            temp /= 10;
            sum += lastDigit;
        }
        System.out.println("The sum of digits is " + sum + ".");

        // To find number of digits
        int numDigits = (int) Math.log10(n) + 1; // Typecasted to int since Maths.log10() gives a boolean
        System.out.println("Number of digits are : " + numDigits);
    }
}
