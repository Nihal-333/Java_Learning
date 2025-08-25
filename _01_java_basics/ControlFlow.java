package _01_java_basics;

public class ControlFlow {
    public static void main(String[] args) {
        int score=75;

        if (score>50) {
            System.err.println("Passed");
        }else{
            System.out.println("Failed");
        }

        int day=3;
        switch(day){
            case 1: System.out.println("Monday"); break;
            case 2: System.out.println("Tuesday"); break;
            case 3: System.out.println("Wednesday"); break;
            default: System.out.println("Invalid day");
        }
    }
}
 