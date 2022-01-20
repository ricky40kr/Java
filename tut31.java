// Sorting 
// Bubble Sort

public class tut31 {
    public static void main(String[] args) {
        int a[] = { 2, 1, 8, -7, -1, 0 };
        int n = a.length;

        System.out.print("Before Sorting : ");
        for (int i : a) {
            System.out.print(i + " ");
        }

        for (int i = 0; i < n - 1; i++) {

            boolean sorted = true;

            for (int j = 0; j < n - 1 - i; j++) {

                if (a[j + 1] < a[j]) { // change the sign to > to get reverse order
                    int temp = a[j + 1];
                    a[j + 1] = a[j];
                    a[j] = temp;

                    sorted = false;
                }
            }
            if (sorted)
                break;
        }
        System.out.println();

        System.out.print("After Sorting : ");
        for (int i : a) {
            System.out.print(i + " ");
        }
    }
}
