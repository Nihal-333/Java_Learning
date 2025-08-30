import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {10, 32, 3, 4, 24, 45};
        System.out.println("Before sorting : " + Arrays.toString(arr));
        QuickSort(arr, 0, arr.length - 1);
        System.out.println("After sorting  : " + Arrays.toString(arr));
    }

    public static void QuickSort(int[] arr, int low, int high) {
        if (low < high) {
            // partition the array
            int pi = partition(arr, low, high);

            // recursively sort elements before and after partition
            QuickSort(arr, low, pi - 1);
            QuickSort(arr, pi + 1, high);
        }
    }

    // Partition using Lomuto’s scheme
    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];  // choose last element as pivot
        int i = low - 1;        // index of smaller element

        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                swap(arr, i, j);
            }
        }

        swap(arr, i + 1, high);
        return i + 1; // return partition index
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
