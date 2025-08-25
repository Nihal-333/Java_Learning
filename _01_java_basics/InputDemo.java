package _01_java_basics;

import java.util.Scanner;

public class InputDemo {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter your name : ");
        String name=sc.next();
        // String name=sc.nextLine();

        System.out.print("Enter your age : ");
        Integer age=sc.nextInt();

        System.out.println("Name : "+ name + " Age : "+ age);
    }
}
