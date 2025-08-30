import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;

public class PreetyPrinting {
    public static void main(String[] args) {
          // ---------- 1. Basic printf specifiers ----------
        System.out.printf("String: %s | Int: %d | Float: %.2f | Char: %c | Bool: %b%n",
                "Luffy", 19, 3.14159, 'Z', true);
        System.out.println();

        // ---------- 2. Width & Alignment ----------
        System.out.printf("%-10s %5d %10.2f%n", "Luffy", 19, 1500000000.75);
        System.out.printf("%-10s %5d %10.2f%n", "Zoro", 21, 1200000000.50);
        System.out.println();

        // ---------- 3. String.format ----------
        String s = String.format("Name: %s | Age: %d", "Nami", 20);
        System.out.println(s);
        System.out.println();

        // ---------- 4. Pretty tables ----------
        System.out.printf("%-10s %-5s %-15s%n", "Name", "Age", "Bounty");
        System.out.printf("%-10s %-5d %-15.2f%n", "Luffy", 19, 1500000000.75);
        System.out.printf("%-10s %-5d %-15.2f%n", "Zoro", 21, 1200000000.50);
        System.out.println();

        // ---------- 5. Collections ----------
        List<String> crew = Arrays.asList("Luffy", "Zoro", "Nami");
        System.out.println("Crew: " + String.join(", ", crew));
        System.out.println();

        // ---------- 6. Text Blocks (Java 15+) ----------
        String bio = """
                     Name: Monkey D. Luffy
                     Role: Captain
                     Crew: Straw Hat Pirates
                     """;
        System.out.println("Text Block:\n" + bio);

        // ---------- 7. DecimalFormat ----------
        double bounty = 1500000000.75;
        DecimalFormat df = new DecimalFormat("#,###.00");
        System.out.println("Formatted bounty: " + df.format(bounty));
        System.out.println();
    }
}
