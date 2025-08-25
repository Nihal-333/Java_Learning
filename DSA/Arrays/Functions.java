
import java.util.Arrays;

public class Functions{
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        change(arr);
        System.out.println(Arrays.toString(arr));
        String[] str={"Go", "Java","Python"};
        changeStr(str);
        System.out.println(Arrays.toString(str));
    }

    static void change(int[] arr){
        arr[0]=1000;
    }
    static void changeStr(String[] arr){
        arr[2]="Hello";
    }
}