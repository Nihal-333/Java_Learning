package _06_collections;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        Map<Integer, String>empMap=new HashMap<>();
        empMap.put(101, "Alice");
        empMap.put(102, "Bob");
        empMap.put(103, "Charlie");

         System.out.println("Employee Map: " + empMap);

        empMap.remove(102);
        System.out.println("After Removal: " + empMap);

        System.out.println("Emp 101: " + empMap.get(101));
        System.out.println("Contains Key 103? " + empMap.containsKey(103));

        System.out.println("Map size : "+empMap.size());
    }
}
