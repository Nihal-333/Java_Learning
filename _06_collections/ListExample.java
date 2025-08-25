package _06_collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        List<String>fruits=new ArrayList<>();

        fruits.add("bannana");
        fruits.add("apple");
        fruits.add("apple");
        fruits.add("mango");

        System.out.println("Fruits list : "+ fruits);

        System.out.println("First Fruit : "+ fruits.get(0));

        Collections.sort(fruits);//Sort the list
        System.out.println("Sorted fruits : "+fruits);
        Collections.reverse(fruits);
        System.out.println("Reverse order fruits : "+fruits);
        System.out.println("List size : "+fruits.size());
    }
}
