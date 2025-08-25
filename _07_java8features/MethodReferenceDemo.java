//4. Method References

package _07_java8features;

import java.util.Arrays;
import java.util.List;

public class MethodReferenceDemo {
    public static void main(String[] args) {
        List<String> cities = Arrays.asList("Mumbai", "Delhi", "Pune");

        // Lambda: cities.forEach(city -> System.out.println(city));
        cities.forEach(System.out::println);  // Method reference
    }
}
