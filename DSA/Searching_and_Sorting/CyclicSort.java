import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        //Used only when numbers in array are from 1 to N without duplicate.
        int[] arr = {3, 5, 2, 1, 4};
        System.out.println("Before sorting : " + Arrays.toString(arr));
        CyclicSort(arr);
        System.out.println("After sorting  : " + Arrays.toString(arr));
    }

     public static void CyclicSort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correctIndex = arr[i] - 1; // where this element should go
            if (arr[i] != arr[correctIndex]) {
                swap(arr, i, correctIndex);
            } else {
                i++;
            }
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
