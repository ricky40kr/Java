// array copying

import java.util.Arrays;

class tut93 {
    public static void main(String[] args) {
        int arr[] = { 4, 5, -8, 10, 6 };
        System.out.println(Arrays.toString(arr));

        // copying using for each loop
        int copy[] = arr;
        for (int num : copy) {
            System.out.print(num + " ");
        }
        System.out.println();

        // copying using arraycopy() method
        int copy2[] = new int[arr.length];
        System.arraycopy(arr, 0, copy2, 0, 5);
        System.out.println(Arrays.toString(copy2));

        // copying using copyOfRange() method
    }
}