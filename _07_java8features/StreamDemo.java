//3. Streams API

package _07_java8features;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo {
    public static void main(String[] args) {
        List<String>names=Arrays.asList("Ankit", "Abhi", "Neha", "Ankit", "Sana");

        // Filter names starting with 'A' and convert to uppercase
        List<String>result=names.stream()
        .filter(n->n.startsWith("A"))
        .map(String::toUpperCase)
        .distinct()
        .sorted()
        .collect(Collectors.toList());

        System.out.println(result);
    }
}
