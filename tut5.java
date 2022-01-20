// To find simple interest

import java.util.Scanner;

public class tut5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int principal = 5000;
        float rate = 12.5f;
        System.out.print("Enter time : ");
        int time = sc.nextInt();
        float simpleInterest = principal * rate * time / 100;

        System.out.println("The simple interest is " + simpleInterest);
        sc.close();
    }
}
