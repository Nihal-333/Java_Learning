import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr={10,32,3,4,24,45};
        System.out.println("Before sorting : "+ Arrays.toString(arr));
        SelectionSort(arr);
        System.out.println("After sorting : " +Arrays.toString(arr));
    }

    public static void SelectionSort(int[] arr){
        int n=arr.length;

        for(int i=0; i<n-1; i++){
            int min=i;
            for(int j=i+1; j<n; j++){
                if(arr[j]<arr[min]){
                    min=j;
                }
            }
            if(min!=i){
                Swap(arr, i, min);
            }
        }
    }

    public static void Swap(int[] arr, int i, int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
