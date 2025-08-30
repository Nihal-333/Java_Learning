import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr={10,32,3,4,24,45};
        System.out.println("Before sorting : "+ Arrays.toString(arr));
        BubbleSort(arr);
        System.out.println("After sorting : " +Arrays.toString(arr));
    }

    public static void BubbleSort(int[] arr){
        int n=arr.length;

        for(int i=0; i<n-1; i++){
            for(int j=i+1; j<n; j++){
                if(arr[j]<arr[i]){
                    Swap(arr, i, j);
                }
            }
        }
    }

    public static void Swap(int[] arr, int i, int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
