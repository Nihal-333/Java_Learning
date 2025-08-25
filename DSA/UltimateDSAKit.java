import java.util.*;

// Ultimate Java DSA Starter Kit
public class UltimateDSAKit {

    public static void main(String[] args) {
        // ======= Arrays =======
        int[] arr = {1, 2, 3, 4, 5};

        // ======= ArrayList =======
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3));
        list.add(4);
        list.remove(Integer.valueOf(2));
        System.out.println("ArrayList: " + list);

        // ======= LinkedList =======
        LinkedList<Integer> ll = new LinkedList<>(Arrays.asList(1, 2, 3));
        ll.addFirst(0); ll.addLast(4); ll.removeFirst(); ll.removeLast();
        System.out.println("LinkedList: " + ll);

        // ======= HashSet / TreeSet =======
        Set<Integer> hs = new HashSet<>(Arrays.asList(1, 2, 3));
        System.out.println("HashSet: " + hs);

        TreeSet<Integer> ts = new TreeSet<>(Arrays.asList(3, 1, 2));
        System.out.println("TreeSet (sorted): " + ts);

        // ======= HashMap / TreeMap =======
        Map<String, Integer> hm = new HashMap<>();
        hm.put("a", 1); hm.put("b", 2);
        System.out.println("HashMap: " + hm);

        TreeMap<Integer, String> tm = new TreeMap<>();
        tm.put(2, "two"); tm.put(1, "one"); tm.put(3, "three");
        System.out.println("TreeMap (sorted keys): " + tm);

        // ======= Queue / Deque / Stack =======
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(1); queue.offer(2); System.out.println("Queue peek: " + queue.peek());

        Deque<Integer> deque = new ArrayDeque<>();
        deque.offerFirst(1); deque.offerLast(2); System.out.println("Deque: " + deque);

        Stack<Integer> stack = new Stack<>();
        stack.push(1); stack.push(2); System.out.println("Stack peek: " + stack.peek());

        // ======= PriorityQueue (Heap) =======
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        minHeap.offer(3); minHeap.offer(1); minHeap.offer(2);
        System.out.print("Min-Heap poll order: ");
        while (!minHeap.isEmpty()) System.out.print(minHeap.poll() + " ");
        System.out.println();

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        maxHeap.offer(3); maxHeap.offer(1); maxHeap.offer(2);
        System.out.print("Max-Heap poll order: ");
        while (!maxHeap.isEmpty()) System.out.print(maxHeap.poll() + " ");
        System.out.println();

        // ======= Collections Utilities =======
        Collections.sort(list); // ascending
        Collections.sort(list, Collections.reverseOrder()); // descending
        Collections.reverse(list);
        int index = Collections.binarySearch(list, 3);
        System.out.println("Sorted list: " + list + ", Binary search index of 3: " + index);

        // ======= DSA Patterns Examples =======
        System.out.println("\nSliding Window Sum:");
        slidingWindowSum(arr, 3);

        System.out.println("\nTwo Pointers Example:");
        twoPointersExample(arr, 5);

        System.out.println("\nBFS Example:");
        bfsExample();

        System.out.println("\nDFS Example:");
        boolean[][] visited = new boolean[3][3];
        dfsExample(0, 0, visited);

        System.out.println("\nBinary Search Example:");
        System.out.println(binarySearch(arr, 4));

        System.out.println("\nTwo Sum Example:");
        twoSum(arr, 5);

        System.out.println("\nPrefix Sum Example:");
        System.out.println(Arrays.toString(prefixSum(arr)));

        System.out.println("\nSliding Window Max Example:");
        slidingWindowMax(arr, 3);
    }

    // ===================== DSA Pattern Templates =====================

    // Sliding Window Sum
    static void slidingWindowSum(int[] arr, int k) {
        int n = arr.length;
        if (k > n) return;
        int sum = 0;
        for (int i = 0; i < k; i++) sum += arr[i];
        System.out.print(sum + " ");
        for (int i = k; i < n; i++) {
            sum += arr[i] - arr[i - k];
            System.out.print(sum + " ");
        }
        System.out.println();
    }

    // Two Pointers
    static void twoPointersExample(int[] arr, int target) {
        Arrays.sort(arr);
        int left = 0, right = arr.length - 1;
        while (left < right) {
            int sum = arr[left] + arr[right];
            if (sum == target) {
                System.out.println("Pair found: " + arr[left] + ", " + arr[right]);
                left++; right--;
            } else if (sum < target) left++;
            else right--;
        }
    }

    // BFS (Graph)
    static void bfsExample() {
        int n = 4;
        ArrayList<Integer>[] graph = new ArrayList[n];
        for (int i = 0; i < n; i++) graph[i] = new ArrayList<>();
        graph[0].add(1); graph[0].add(2); graph[1].add(2);
        graph[2].add(0); graph[2].add(3); graph[3].add(3);

        boolean[] visited = new boolean[n];
        Queue<Integer> q = new LinkedList<>();
        q.offer(2); visited[2] = true;

        while (!q.isEmpty()) {
            int node = q.poll();
            System.out.print(node + " ");
            for (int nei : graph[node]) {
                if (!visited[nei]) { visited[nei] = true; q.offer(nei); }
            }
        }
        System.out.println();
    }

    // DFS (Matrix / Graph)
    static void dfsExample(int i, int j, boolean[][] visited) {
        int n = visited.length, m = visited[0].length;
        if (i < 0 || j < 0 || i >= n || j >= m || visited[i][j]) return;
        visited[i][j] = true;
        System.out.print("(" + i + "," + j + ") ");
        dfsExample(i + 1, j, visited); dfsExample(i - 1, j, visited);
        dfsExample(i, j + 1, visited); dfsExample(i, j - 1, visited);
    }

    // Binary Search
    static int binarySearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) return mid;
            else if (arr[mid] < target) left = mid + 1;
            else right = mid - 1;
        }
        return -1;
    }

    // Two Sum using HashMap
    static void twoSum(int[] arr, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int complement = target - arr[i];
            if (map.containsKey(complement)) {
                System.out.println("Pair found: " + complement + ", " + arr[i]);
                return;
            }
            map.put(arr[i], i);
        }
        System.out.println("No pair found.");
    }

    // Prefix Sum
    static int[] prefixSum(int[] arr) {
        int n = arr.length;
        int[] prefix = new int[n];
        prefix[0] = arr[0];
        for (int i = 1; i < n; i++) prefix[i] = prefix[i - 1] + arr[i];
        return prefix;
    }

    // Sliding Window Max (Deque)
    static void slidingWindowMax(int[] arr, int k) {
        Deque<Integer> dq = new ArrayDeque<>();
        for (int i = 0; i < arr.length; i++) {
            while (!dq.isEmpty() && dq.peekFirst() <= i - k) dq.pollFirst();
            while (!dq.isEmpty() && arr[dq.peekLast()] < arr[i]) dq.pollLast();
            dq.offerLast(i);
            if (i >= k - 1) System.out.print(arr[dq.peekFirst()] + " ");
        }
        System.out.println();
    }
}
