// Merge Sort

public class tut80 {

    public static void merge(int arr[], int low, int mid, int high) {
        int i, j, k, arr2[];
        arr2 = new int[high + 1];
        i = low;
        j = mid + 1;
        k = low;

        while (i <= mid && j <= high) {
            if (arr[i] < arr[j]) {
                arr2[k++] = arr[i++];
            }

            else {
                arr2[k++] = arr[j++];
            }
        }

        while (i <= mid) {
            arr2[k++] = arr[i++];
        }

        while (j <= high) {
            arr2[k++] = arr[j++];
        }

        for (int h = low; h <= high; h++) {
            arr[h] = arr2[h];
        }
    }

    public static void mergeSort(int a[], int beg, int end) {
        if (beg < end) {
            int mid = (beg + end) / 2;
            mergeSort(a, beg, mid);
            mergeSort(a, mid + 1, end);
            merge(a, beg, mid, end);
        }
    }

    public static void main(String[] args) {
        int a[] = { 4, 5, 9, 6, -22 };
        mergeSort(a, 0, 4);
        for (int i = 0; i < 5; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
