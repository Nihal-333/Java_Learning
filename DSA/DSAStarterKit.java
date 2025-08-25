import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;

// Java DSA Starter Kit
public class DSAStarterKit {

    public static void main(String[] args) {
        // ======= Arrays =======
        int[] arr = {1, 2, 3, 4};
        int n = arr.length;

        // ======= ArrayList =======
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3));
        list.add(4);
        list.remove(Integer.valueOf(2));
        System.out.println("ArrayList: " + list);

        // ======= LinkedList =======
        LinkedList<Integer> ll = new LinkedList<>(Arrays.asList(1, 2, 3));
        ll.addFirst(0);
        ll.addLast(4);
        ll.removeFirst();
        ll.removeLast();
        System.out.println("LinkedList: " + ll);

        // ======= HashSet =======
        Set<Integer> hs = new HashSet<>();
        hs.add(1); hs.add(2); hs.add(3);
        hs.remove(2);
        System.out.println("HashSet: " + hs);

        // ======= TreeSet =======
        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(3); ts.add(1); ts.add(2);
        System.out.println("TreeSet (sorted): " + ts);
        System.out.println("Ceiling of 2: " + ts.ceiling(2));
        System.out.println("Floor of 2: " + ts.floor(2));

        // ======= HashMap =======
        Map<String, Integer> hm = new HashMap<>();
        hm.put("a", 1);
        hm.put("b", 2);
        System.out.println("HashMap: " + hm);
        System.out.println("Contains key 'a'? " + hm.containsKey("a"));

        // ======= TreeMap =======
        TreeMap<Integer, String> tm = new TreeMap<>();
        tm.put(2, "two"); tm.put(1, "one"); tm.put(3, "three");
        System.out.println("TreeMap (sorted by key): " + tm);
        System.out.println("First key: " + tm.firstKey() + ", Last key: " + tm.lastKey());

        // ======= Queue =======
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(1); queue.offer(2); queue.offer(3);
        System.out.println("Queue peek: " + queue.peek());
        queue.poll();
        System.out.println("Queue after poll: " + queue);

        // ======= Deque =======
        Deque<Integer> deque = new ArrayDeque<>();
        deque.offerFirst(1); deque.offerLast(2);
        System.out.println("Deque: " + deque);
        deque.pollFirst(); deque.pollLast();
        System.out.println("Deque after polling: " + deque);

        // ======= Stack =======
        Stack<Integer> stack = new Stack<>();
        stack.push(1); stack.push(2); stack.push(3);
        System.out.println("Stack peek: " + stack.peek());
        stack.pop();
        System.out.println("Stack after pop: " + stack);

        // ======= PriorityQueue =======
        // Min-Heap (default)
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        minHeap.offer(3); minHeap.offer(1); minHeap.offer(2);
        System.out.println("Min-Heap poll: " + minHeap.poll());

        // Max-Heap
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        maxHeap.offer(3); maxHeap.offer(1); maxHeap.offer(2);
        System.out.println("Max-Heap poll: " + maxHeap.poll());

        // ======= Collections Utilities =======
        Collections.sort(list); // ascending
        Collections.sort(list, Collections.reverseOrder()); // descending
        Collections.reverse(list);
        int index = Collections.binarySearch(list, 3);
        System.out.println("Sorted list: " + list + ", Binary search index of 3: " + index);

        // ======= Iterators =======
        Iterator<Integer> it = list.iterator();
        System.out.print("Iterator over list: ");
        while (it.hasNext()) System.out.print(it.next() + " ");
        System.out.println();

        // ======= String Utilities =======
        String s = "hello";
        System.out.println("Length: " + s.length());
        System.out.println("Char at 1: " + s.charAt(1));
        StringBuilder sb = new StringBuilder("hello");
        sb.append(" world");
        System.out.println("StringBuilder: " + sb);
    }

    // ======= Example Methods =======
    // Swap two integers
    static void swap(int[] arr, int i, int j) {
        int t = arr[i]; arr[i] = arr[j]; arr[j] = t;
    }

    // Reverse an array
    static void reverseArray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n / 2; i++) {
            swap(arr, i, n - i - 1);
        }
    }
}
