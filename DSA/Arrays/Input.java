
import java.util.Arrays;
import java.util.Scanner;


import java.util.Scanner;

public class Input{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int[] arr=new int[2];
        System.out.print("Enter number :");
        for (int idx = 0; idx < arr.length; idx++) {
            arr[idx]=in.nextInt();
        }
        System.out.println("Array : "+Arrays.toString(arr));
        String[] arr1=new String[2];
        System.out.print("Enter string :");
        for (int idx = 0; idx < arr1.length; idx++) {
            arr1[idx]=in.next();
        }
        System.out.println("Array : "+Arrays.toString(arr1));

        int[][] arr2=new int[3][3];
        System.out.print("Enter values for 2D array :");
        for (int row = 0; row < arr2.length; row++) {
            for(int col=0; col<arr2[row].length; col++){
                arr2[row][col]=in.nextInt();
            }
        }
        System.out.println("Array : "+Arrays.deepToString(arr2));
    }
}