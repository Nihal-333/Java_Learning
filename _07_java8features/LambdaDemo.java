// 1. Lambda Expressions

package _07_java8features;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LambdaDemo {
    public static void main(String[] args) {
        List<String>names=Arrays.asList("Aman", "Zara", "Neha", "Mohan");

        //Before java 8
        Collections.sort(names,new Comparator<String>() {
            public int compare(String a, String b){
                return a.compareTo(b);
            }
        });

         // Java 8: Lambda expression
        names.sort((a, b) -> a.compareTo(b));
        System.out.println(names);
        names.forEach(name->System.out.println(name));
    }
}
