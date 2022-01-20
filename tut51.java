// Output Formatting using printf

import java.util.Scanner;

public class tut51 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int k = sc.nextInt();
        System.out.println("================================");
        System.out.print(s + "           ");
        System.out.printf("%03d%n" + k);
        System.out.println("================================");
        sc.close();
    }
}
