public class StringBuilderDemo {
    public static void main(String[] args) {
        // ---------- Create ----------
        StringBuilder sb = new StringBuilder("Luffy");
        System.out.println("Initial: " + sb);

        // ---------- Append ----------
        sb.append(" the Pirate King");
        System.out.println("Append: " + sb);

        // ---------- Insert ----------
        sb.insert(5, " Monkey D.");
        System.out.println("Insert: " + sb);

        // ---------- Replace ----------
        sb.replace(0, 5, "Captain");
        System.out.println("Replace: " + sb);

        // ---------- Delete ----------
        sb.delete(0, 8); // deletes "Captain "
        System.out.println("Delete: " + sb);

        // ---------- Reverse ----------
        sb.reverse();
        System.out.println("Reverse: " + sb);

        // ---------- Re-reverse (to get back original order) ----------
        sb.reverse();

        // ---------- SetCharAt ----------
        sb.setCharAt(0, 'L');
        System.out.println("SetCharAt: " + sb);

        // ---------- GetCharAt ----------
        System.out.println("GetCharAt: " + sb.charAt(0));

        // ---------- Length & Capacity ----------
        System.out.println("Length: " + sb.length());
        System.out.println("Capacity: " + sb.capacity()); // initial + growth

        // ---------- EnsureCapacity ----------
        sb.ensureCapacity(50);
        System.out.println("Capacity after ensure: " + sb.capacity());

        // ---------- DeleteCharAt ----------
        sb.deleteCharAt(0);
        System.out.println("DeleteCharAt: " + sb);

        // ---------- Substring (works like String’s substring) ----------
        String sub = sb.substring(0, 6);
        System.out.println("Substring: " + sub);

        // ---------- Clear (reset by setting length 0) ----------
        sb.setLength(0);
        System.out.println("After clear, length: " + sb.length());
    }
}
