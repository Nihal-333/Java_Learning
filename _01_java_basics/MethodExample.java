package _01_java_basics;

public class MethodExample {
    public static int add(int a, int b){
        return a+b;
    }
    public static void main(String[] args) {
        int result=add(15, 35);
        System.out.println("Result : "+ result);
    }
}
