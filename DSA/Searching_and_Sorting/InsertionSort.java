import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr={10,32,3,4,24,45};
        System.out.println("Before sorting : "+ Arrays.toString(arr));
        InsertionSort(arr);
        System.out.println("After sorting : " +Arrays.toString(arr));
    }

    public static void InsertionSort(int[] arr) {
        int n=arr.length;

        for(int i=1; i<n; i++){
            // current element to insert
            int key=arr[i];
            int j=i-1;
            // shift larger elements to the right
            while(j>=0 && arr[j]>key){
                arr[j+1]=arr[j];
                j--;
            }
            // place key at its correct position
            arr[j+1]=key;
        }
    }
}
