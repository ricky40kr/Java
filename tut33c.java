// Taking String from user

import java.util.Scanner;

public class tut33c {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a String : ");
        String s1 = sc.next();
        System.out.println(s1);
        sc.nextLine();
        // new line character (\n) created by pressing enter during sc.next() due to
        // which sc.nextLine() reads \n and don't ask for user input
        System.out.print("Enter another String : ");
        String s2 = sc.nextLine();
        System.out.println(s2);

        sc.close();
    }
}
