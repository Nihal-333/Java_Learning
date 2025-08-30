import java.util.ArrayList;

public class BasicString{
    public static void main(String[] args) {
        String a="Luffy";
        String b="Luffy";
        System.out.println("Comparison of Strings");
        System.out.println(a==b);//true - Java maintains a String pool, so both variables point to the same object in the pool.
        
        //Java evaluates operators from left to right, and + (string concatenation) has higher precedence
        //than ==. So this expression is read as: ("a==b : " + a) == b
        System.out.println("a==b : "+ a==b);//This will give false
        
        String name1=new String("Naruto");
        String name2=new String("Naruto");

        System.out.println(name1==name2);
        System.out.println("name1 equals name2 :"+ name1.equals(name2));//compare values only
        System.out.println();

        String str = "  Hello World  ";

        // 1. Length
        System.out.println("Length: " + str.length());  // 15

        // 2. Character at index
        System.out.println("Char at 1: " + str.charAt(1));  // ' '

        // 3. Substring
        System.out.println("Substring(2, 7): " + str.substring(2, 7));  // "Hello"

        // 4. Concatenation
        String s1 = "Java";
        String s2 = "Programming";
        System.out.println("Concat: " + s1.concat(" " + s2));  // "Java Programming"
        System.out.println(1+"Zoro");
        System.out.println(1+"Luffy"+2);
        System.out.println("Sanji"+3);
        System.out.println("Nami"+new ArrayList<>());
        System.out.println("Chopper"+new Integer(12));
        System.out.println("Brook"+'a');
        System.out.println('a'+'b');
        System.out.println("a"+"b");
        System.out.println();

        // 5. Equals (value check) vs ==
        String p = "Test";
        String q = new String("Test");
        System.out.println("equals: " + p.equals(q));   // true
        System.out.println("== : " + (p == q));        // false
        System.out.println();

        // 6. Ignore case comparison
        System.out.println("equalsIgnoreCase: " + "java".equalsIgnoreCase("JAVA"));  // true

        // 7. Contains
        System.out.println("Contains 'World'? " + str.contains("World"));  // true

        // 8. Index of / Last index of
        System.out.println("IndexOf 'o': " + str.indexOf('o'));         // 5
        System.out.println("LastIndexOf 'o': " + str.lastIndexOf('o')); // 8

        // 9. Replace
        System.out.println("Replace: " + str.replace("World", "Java")); // "  Hello Java  "

        // 10. Uppercase / Lowercase
        System.out.println("Upper: " + str.toUpperCase());  // "  HELLO WORLD  "
        System.out.println("Lower: " + str.toLowerCase());  // "  hello world  "

        // 11. Trim (remove leading/trailing spaces)
        System.out.println("Trimmed: '" + str.trim() + "'");  // "Hello World"
        System.out.println("Length of str after Trimming : " + str.length());  // It does not change original str
        System.out.println();

        // 12. Split (based on regex)
        String csv = "apple,banana,grape";
        String[] fruits = csv.split(",");
        System.out.println("Fruits:");
        for (String f : fruits) {
            System.out.println(f);
        }
        System.out.println();

        // 13. StartsWith / EndsWith
        System.out.println("StartsWith '  He': " + str.startsWith("  He")); // true
        System.out.println("EndsWith 'ld  ': " + str.endsWith("ld  "));     // true

        // 14. IsEmpty / IsBlank (Java 11+)
        System.out.println("IsEmpty: " + "".isEmpty());   // true
        System.out.println("IsBlank: " + "   ".isBlank()); // true (ignores spaces)

        // 15. ValueOf (convert other types to String)
        int num = 42;
        String numStr = String.valueOf(num);
        System.out.println("ValueOf int: " + numStr); // "42"

        // 16. Join (Java 8+)
        String joined = String.join(" - ", "One", "Two", "Three");
        System.out.println("Joined: " + joined); // "One - Two - Three"
        System.out.println();

        

    }
}