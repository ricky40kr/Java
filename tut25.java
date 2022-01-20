// do-while loop

import java.util.Scanner;

public class tut25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        sc.close();

        do {
            System.out.println(n + " ");
            n -= 1;
        } while (n > 10);
    }
}
