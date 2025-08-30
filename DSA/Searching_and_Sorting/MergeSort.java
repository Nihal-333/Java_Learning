import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {10, 32, 3, 4, 24, 45};
        System.out.println("Before sorting : " + Arrays.toString(arr));
        MergeSort(arr, 0, arr.length - 1);
        System.out.println("After sorting  : " + Arrays.toString(arr));
    }

    public static void MergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;

            // recursively sort two halves
            MergeSort(arr, left, mid);
            MergeSort(arr, mid + 1, right);

            // merge sorted halves
            merge(arr, left, mid, right);
        }
    }

    public static void merge(int[] arr, int left, int mid, int right) {
        // sizes of two subarrays
        int n1 = mid - left + 1;
        int n2 = right - mid;

        // temp arrays
        int[] L = new int[n1];
        int[] R = new int[n2];

        // copy data
        for (int i = 0; i < n1; i++) {
            L[i] = arr[left + i];
        }
        for (int j = 0; j < n2; j++) {
            R[j] = arr[mid + 1 + j];
        }

        // merge temp arrays back
        int i = 0, j = 0, k = left;

        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k++] = L[i++];
            } else {
                arr[k++] = R[j++];
            }
        }

        // copy remaining elements (if any)
        while (i < n1) {
            arr[k++] = L[i++];
        }
        while (j < n2) {
            arr[k++] = R[j++];
        }
    }
}
