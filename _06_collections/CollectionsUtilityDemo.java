package _06_collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionsUtilityDemo {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 5, 20, 15);

        Collections.sort(numbers);
        System.out.println("Sorted: " + numbers);

        Collections.reverse(numbers);
        System.out.println("Reversed: " + numbers);

        int max = Collections.max(numbers);
        System.out.println("Max: " + max);
    }
}
