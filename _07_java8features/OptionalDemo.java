//5. Optional Class
 
package _07_java8features;

import java.util.Optional;

public class OptionalDemo {
    public static void main(String[] args){
        Optional<String> name = Optional.ofNullable(null);

        System.out.println(name.orElse("Default"));

        name.ifPresent(n -> System.out.println("Name is: " + n));

        Optional<String> name1 = Optional.ofNullable("Nihal");

        System.out.println(name1.orElse("Default"));

        name1.ifPresent(n -> System.out.println("Name is: " + n));
    }
}
