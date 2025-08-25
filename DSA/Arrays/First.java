
import java.util.Arrays;

public class First {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        System.out.println(Arrays.toString(arr));
        int[] arr1 = new int[5];
        arr1 = new int[]{5, 6, 7, 8, 9, 10};
        System.out.println(Arrays.toString(arr1));
        System.out.println("Length : " + arr1.length);

        int[][] arr2 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println("Length : " + arr2.length);
        System.out.println(arr2[0][1]);

        System.out.println("2D Array output formats");

        System.out.println("format 1");
        for (int[] row : arr2) {
            System.out.println(Arrays.toString(row));
        }
        System.out.println("format 2");
        System.out.println(Arrays.deepToString(arr2));
        System.out.println("format 3");
        for (int row = 0; row < arr2.length; row++) {
            for (int col = 0; col < arr2[row].length; col++) {
                System.out.print(arr2[row][col] + " ");
            }
            System.out.println();
        }
    }
};
