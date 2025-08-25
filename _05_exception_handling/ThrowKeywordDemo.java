package _05_exception_handling;

public class ThrowKeywordDemo {
    public static void main(String[] args) {
        int age = 15;
        try {
            if (age<18) {
                throw new IllegalArgumentException("Age must be greater than 18");
            }
            System.out.println("Eligible for vote!");
        } catch (IllegalArgumentException e) {
            // TODO: handle exception
            System.err.println("Error : "+ e.getMessage());
        }
    }
}
