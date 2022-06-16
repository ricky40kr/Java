// Quick Sort

public class tut83 {
    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static int partition(int a[], int low, int high) {
        int pivot = a[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (a[j] < pivot) {
                i++;
                if (i != j) {
                    swap(a, i, j);
                }
            }
        }
        swap(a, i + 1, high);
        return i + 1;
    }

    public static void quickSort(int a[], int low, int high) {
        if (low < high) {
            int q = partition(a, low, high);
            quickSort(a, low, q - 1);
            quickSort(a, q + 1, high);
        }
    }

    public static void main(String[] args) {
        int a[] = { 6, 3, 9, 5, 2, 8 };
        quickSort(a, 0, 5);
        for (int i = 0; i < 6; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
