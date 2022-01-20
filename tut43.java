// To check number data type

import java.util.Scanner;

public class tut43 {
    public static void main(String[] args) {
        System.out.println("Enter a number : ");
        Scanner sc= new Scanner(System.in);
        System.out.println(sc.hasNextInt());
        System.out.println(sc.hasNextFloat());
        System.out.println(sc.hasNextLine());

        sc.close();
    }
}
