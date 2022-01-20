// Bit Manipulation (Using Bit Masking)

import java.util.Scanner;

public class tut49 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Get Bit
        int n1 = 5;
        int pos1 = 2;
        int bitMask1 = 1 << pos1;

        if ((bitMask1 & n1) == 0) {
            System.out.println("Bit = 0");
        } else {
            System.out.println("Bit = 1");
        }

        // Set Bit
        int n2 = 5;
        int pos2 = 3;
        int bitMask2 = 1 << pos2;

        n2 = bitMask2 | n2;
        System.out.println("After setting bit : " + n2);

        // Clear Bit
        int n3 = 5;
        int pos3 = 2;
        int bitMask3 = ~(1 << pos3);

        n3 = bitMask3 & n3;
        System.out.println("After clearing bit : " + n3);

        // Update
        System.out.print("Enter a Operation you want to make : ");
        int opr = sc.nextInt();
        int n4 = 5;
        int pos4 = 1;
        int bitMask4 = 1 << pos4;

        // For making 1 we have to perform Set operation
        if (opr == 1) {
            n4 = bitMask4 | n4;
            System.out.println("After updating bit : " + n4);
        }

        // For making 0 we have to perform Clear operation
        else {
            int bitMask5 = ~bitMask4;
            n4 = bitMask5 & n4;
            System.out.println("After updating bit : " + n4);

        }
        sc.close();
    }
}
