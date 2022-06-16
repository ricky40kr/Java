// Tower of Hanoi

import java.util.Scanner;

public class tut92 {
    public static void towerOfHanoi(int n, String src, String helper, String dest) {
        if (n == 1) {
            System.out.println("disk " + n + " from " + src + " to " + dest);
            return;
        }
        // transfer top n-1 from src to helper using dest as 'helper'
        towerOfHanoi(n - 1, src, dest, helper);
        // transfer nth from src to dest
        System.out.println("disk " + n + " from " + src + " to " + helper);
        // transfer n-1 from helper to dest using src as 'helper'
        towerOfHanoi(n - 1, helper, src, dest);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        towerOfHanoi(n, "A", "B", "C");
        sc.close();
    }
}