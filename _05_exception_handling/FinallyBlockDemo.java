package _05_exception_handling;

public class FinallyBlockDemo {
    public static void main(String[] args) {
        try {
            int []arr={1,2,3,4};
            System.out.println(arr[5]);
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Error: "+ e);
        } finally{
            System.out.println("This block always executes!");
        }
    }
}
