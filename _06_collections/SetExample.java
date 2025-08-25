package _06_collections;

import java.util.HashSet;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {
        Set<String>languages=new HashSet<>();

        languages.add("English");
        languages.add("English");//not inserted
        languages.add("Hindi");
        languages.add("Marathi");

        System.out.println("Language set : "+ languages);
        languages.remove("Hindi");

        System.out.println("After removal: " + languages);

        System.out.println("Contains Marathi ?"+ languages.contains("Marathi"));
        System.out.println("Set size : "+languages.size());
    }
}
