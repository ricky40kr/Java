// Binary Search

import java.util.Scanner;

public class tut85 {
    public static int BinarySearch(int arr[], int beg, int end, int key) {
        if (beg <= end) {
            int mid = (beg + end) / 2;
            if (arr[mid] == key) {
                return mid;
            } else if (arr[mid] > key) {
                return BinarySearch(arr, beg, mid - 1, key);
            } else {
                return BinarySearch(arr, mid + 1, end, key);
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = { -22, 4, 5, 9, 35 };
        int key;
        int beg = 0;
        int end = a.length - 1;

        System.out.print("Enter the number you want to search in array : ");
        key = sc.nextInt();

        int pos = BinarySearch(a, beg, end, key);
        if (pos == -1) {
            System.out.println("Element not found!");
        } else {
            System.out.println("Element found in the array at position : " + (pos + 1));
        }
        sc.close();
    }
}
