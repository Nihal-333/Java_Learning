package _05_exception_handling;

public class BasicExceptionDemo {
    public static void main(String[] args){
        try {
            int result=10/0; //ArithmeticException
            System.out.println("Result : "+ result);
        } catch (ArithmeticException e) {
            // TODO: handle exception
            System.out.println("Error: Cannot divide numbder by zero!");
        }

        System.out.println("Program Continues.....");
    } 
}
