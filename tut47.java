// Linear Search without using class

import java.util.Scanner;

public class tut47 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\t\tLinear Search Program");
        System.out.println("\t\t*********************");

        int flag = 0, mug = 0, item, n;

        // Creating Array
        System.out.print("Enter the length of array you want : ");
        n = sc.nextInt();
        System.out.println();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter the value of " + (i + 1) + " position : ");
            arr[i] = sc.nextInt();
        }

        // Linear Search in the Array
        System.out.println("Enter the number you want to search : ");
        item = sc.nextInt();

        for (int i = 0; i < n; i++) {
            if (arr[i] == item) {
                flag = 1;
                mug = i + 1;
            }
        }
        if (flag == 1) {
            System.out.println("Search is Successful!");
            System.out.println(item + " is at " + mug + " position in the array.");
        } else {
            System.out.println("Search is Unsuccessful!");
            System.out.println(item + " doesn't exists in the array.");
        }

        sc.close();
    }
}
