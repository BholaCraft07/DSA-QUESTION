/**
 * mergeSort
 */

public class mergeSort {

    static void merge(int arr[], int start, int mid, int last) {
        // Your code here
        int i, j, k;
        int n1 = mid - start + 1;
        int a[] = new int[n1];
        int b[] = new int[last - mid];
        for (i = 0; i < n1; i++) {
            a[i] = arr[start + i];
        }
        for (j = 0; j < b.length; j++) {
            b[j] = arr[mid + 1 + j];
        }
        i = 0;
        j = 0;
        k = start;
        while (i < a.length && j < b.length) {
            if (a[i] <= b[j]) {
                arr[k] = a[i];
                i++;
            } else {
                arr[k] = b[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            arr[k++] = a[i++];
        }
        while (j < b.length) {
            arr[k++] = b[j++];
        }

    }

    static void mergeSortRecursive(int arr[], int low, int high) {
        if (low >= high) {
            return;
        }
        int mid = (low + high) / 2;
        mergeSortRecursive(arr, low, mid);
        mergeSortRecursive(arr, mid + 1, high);
        merge(arr, low, mid, high);
    }

    public static void main(String[] args) {
        int arr[] = { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };
        System.out.println("Merg sort :");
        mergeSortRecursive(arr, 0, arr.length - 1);
        for (int i : arr) {
            System.out.print(i + "  ");
        }

    }

}