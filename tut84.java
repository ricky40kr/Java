// Insertion sort

public class tut84 {
    public static void main(String[] args) {
        int a[] = { 4, 5, 9, 6, -22 };
        int n = a.length;

        System.out.print("Before Sorting : ");
        for (int i : a) {
            System.out.print(i + " ");
        }
        System.out.println();

        // Sorting
        for (int i = 1; i < n; i++) {
            int j = i - 1;
            int key = a[i];
            while (j >= 0 && key < a[j]) {
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = key;
        }

        System.out.print("After Sorting : ");
        for (int i : a) {
            System.out.print(i + " ");
        }
    }
}
