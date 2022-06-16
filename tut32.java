// Sorting
// Selection sorting

public class tut32 {
    public static void main(String[] args) {
        int a[] = { 2, 1, 8, -7, -1, 0 };
        int n = a.length;

        System.out.print("Before Sorting : ");
        for (int i : a) {
            System.out.print(i + " ");
        }

        for (int i = 0; i < n - 1; i++) {
            int midInd = i;
            for (int j = i + 1; j < n; j++) {
                if (a[j] < a[midInd]) { // change the sign to > to get reverse order
                    midInd = j;
                }
            }
            if (i != midInd) {
                int temp = a[i];
                a[i] = a[midInd];
                a[midInd] = temp;
            }
        }
        System.out.println();

        System.out.print("After Sorting : ");
        for (int i : a) {
            System.out.print(i + " ");
        }
    }
}
