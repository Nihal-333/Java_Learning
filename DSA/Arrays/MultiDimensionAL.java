import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MultiDimensionAL {
    public static void main(String[] args) {
        // 1. Creating a 2D ArrayList
        ArrayList<ArrayList<Integer>> list2D = new ArrayList<>();

        // Adding rows
        list2D.add(new ArrayList<>(Arrays.asList(10, 20, 30)));
        list2D.add(new ArrayList<>(Arrays.asList(40, 50, 60)));
        list2D.add(new ArrayList<>(Arrays.asList(70, 80, 90)));

        System.out.println("2D List values: " + list2D);
        System.out.println();

        // 2. Adding element to a specific row
        // list2D.get(0).add(5, 25); // will throw IndexOutOfBoundsException, so better add at valid index
        list2D.get(0).add(1, 15); // adding 15 at index 1 of first row
        System.out.println("After adding 15 at index 1 of first row: " + list2D);

        // 3. Adding a new row
        list2D.add(new ArrayList<>(Arrays.asList(100, 110)));
        System.out.println("After adding new row: " + list2D);
        System.out.println();

        // addFirst (add a new row at beginning)
        list2D.add(0, new ArrayList<>(Arrays.asList(5, 15, 25)));
        System.out.println("After addFirst row: " + list2D);

        // addLast (add a new row at end)
        list2D.add(new ArrayList<>(Arrays.asList(100, 110, 120)));
        System.out.println("After addLast row: " + list2D);
        System.out.println();

        // 4. Accessing element
        System.out.println("Element at row 1, col 2: " + list2D.get(1).get(2));

        // 5. Modifying element
        list2D.get(2).set(1, 85); // change 80 -> 85
        System.out.println("After set operation: " + list2D);
        System.out.println();

        // 6. Check if row contains a value
        System.out.println("Row 0 contains 20? " + list2D.get(0).contains(20));
        System.out.println();

        // contains (check if a specific row exists)
        ArrayList<Integer> rowToCheck = new ArrayList<>(Arrays.asList(40, 50, 60));
        System.out.println("Contains [40,50,60]? " + list2D.contains(rowToCheck));
        System.out.println();
        

        // 7. Sorting a specific row (ascending)
        Collections.sort(list2D.get(0));
        System.out.println("Row 0 after sorting ascending: " + list2D.get(0));

        // 8. Sorting a specific row (descending)
        list2D.get(1).sort((a, b) -> b - a);
        System.out.println("Row 1 after sorting descending: " + list2D.get(1));
        System.out.println();

        // 9. Iterating using forEach
        System.out.print("Iterating 2D list using forEach : ");
        list2D.forEach(row -> row.forEach(elem -> System.out.print(elem + " ")));
        System.out.println();

        // 10. Doubling each element in all rows using replaceAll
        list2D.forEach(row -> row.replaceAll(n -> n * 2));
        System.out.println("After replaceAll operation (double values): " + list2D);
        System.out.println();

        // 11. Removing element from a row
        list2D.get(0).remove(1); // remove element at index 1 of first row
        System.out.println("After remove operation on row 0: " + list2D);

        // removeFirst (remove first row)
        list2D.remove(0);
        System.out.println("After removeFirst row: " + list2D);

        // removeLast (remove last row)
        list2D.remove(list2D.size() - 1);
        System.out.println("After removeLast row: " + list2D);
        

        // 12. Removing elements conditionally from a row
        list2D.get(1).removeIf(n -> n > 80);
        System.out.println("After removeIf >80 on row 1: " + list2D);

        // 13. Removing all elements from a row present in another list
        ArrayList<Integer> removeList = new ArrayList<>(Arrays.asList(40, 60));
        list2D.get(1).removeAll(removeList);
        System.out.println("After removeAll operation on row 1: " + list2D);

        // removeAll (remove multiple rows at once)
        ArrayList<ArrayList<Integer>> removeRows = new ArrayList<>();
        removeRows.add(new ArrayList<>(Arrays.asList(10, 20, 30)));
        removeRows.add(new ArrayList<>(Arrays.asList(70, 80, 90)));
        list2D.removeAll(removeRows);
        System.out.println("After removeAll rows: " + list2D);
        System.out.println();

        // 14. Clearing a row
        list2D.get(2).clear();
        System.out.println("After clearing row 2: " + list2D);
        list2D.clear();
        System.out.println("After clear all rows: " + list2D);
        System.out.println();

        // Re-add for next examples
        list2D.add(new ArrayList<>(Arrays.asList(1, 2, 3)));
        list2D.add(new ArrayList<>(Arrays.asList(4, 5, 6)));
        list2D.add(new ArrayList<>(Arrays.asList(7, 8, 9)));

        // 15. Accessing sublist of a row
        List<Integer> subRow = list2D.get(0).subList(0, 2);
        System.out.println("Sublist of row 0 (index 0 to 1): " + subRow);

        // 16. Checking if 2D list is empty
        System.out.println("Is 2D list empty? " + list2D.isEmpty());
        System.out.println();

        // reversed (reverse the order of rows)
        Collections.reverse(list2D);
        System.out.println("After reversing 2D list (rows order): " + list2D);
        System.out.println();

        // sort complete list (flatten, sort ascending)
        ArrayList<Integer> flattened = new ArrayList<>();
        list2D.forEach(flattened::addAll);
        Collections.sort(flattened);
        System.out.println("Complete 2D list flattened & sorted ascending: " + flattened);

        // sort complete list descending
        Collections.sort(flattened, Collections.reverseOrder());
        System.out.println("Complete 2D list flattened & sorted descending: " + flattened);
    }
}
