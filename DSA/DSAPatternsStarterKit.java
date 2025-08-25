import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

// Java DSA Patterns Starter Kit
public class DSAPatternsStarterKit {

    public static void main(String[] args) {
        // Example usage
        int[] arr = {1, 2, 3, 4, 5};

        System.out.println("Sliding Window Sum:");
        int k = 3;
        slidingWindowSum(arr, k);

        System.out.println("\nTwo Pointers:");
        twoPointersExample(arr, 5);

        System.out.println("\nBFS Example:");
        bfsExample();

        System.out.println("\nDFS Example:");
        boolean[][] visited = new boolean[3][3];
        dfsExample(0, 0, visited);

        System.out.println("\nHeap Example:");
        heapExample();
    }

    // ===================== 1. Sliding Window =====================
    static void slidingWindowSum(int[] arr, int k) {
        int n = arr.length;
        if (k > n) return;
        int windowSum = 0;

        for (int i = 0; i < k; i++) windowSum += arr[i];
        System.out.print(windowSum + " ");

        for (int i = k; i < n; i++) {
            windowSum += arr[i] - arr[i - k];
            System.out.print(windowSum + " ");
        }
        System.out.println();
    }

    // ===================== 2. Two Pointers =====================
    static void twoPointersExample(int[] arr, int target) {
        Arrays.sort(arr); // Ensure array is sorted
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

    // ===================== 3. BFS (Graph or Matrix) =====================
    static void bfsExample() {
        int n = 4;
        ArrayList<Integer>[] graph = new ArrayList[n];
        for (int i = 0; i < n; i++) graph[i] = new ArrayList<>();
        // Example edges
        graph[0].add(1); graph[0].add(2);
        graph[1].add(2); graph[2].add(0);
        graph[2].add(3); graph[3].add(3);

        boolean[] visited = new boolean[n];
        Queue<Integer> q = new LinkedList<>();
        q.offer(2);
        visited[2] = true;

        while (!q.isEmpty()) {
            int node = q.poll();
            System.out.print(node + " ");
            for (int nei : graph[node]) {
                if (!visited[nei]) {
                    visited[nei] = true;
                    q.offer(nei);
                }
            }
        }
        System.out.println();
    }

    // ===================== 4. DFS (Graph or Matrix) =====================
    static void dfsExample(int i, int j, boolean[][] visited) {
        int n = visited.length, m = visited[0].length;
        if (i < 0 || j < 0 || i >= n || j >= m || visited[i][j]) return;

        visited[i][j] = true;
        System.out.print("(" + i + "," + j + ") ");

        dfsExample(i + 1, j, visited);
        dfsExample(i - 1, j, visited);
        dfsExample(i, j + 1, visited);
        dfsExample(i, j - 1, visited);
    }

    // ===================== 5. Heap Example (PriorityQueue) =====================
    static void heapExample() {
        // Min-Heap
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        minHeap.offer(5); minHeap.offer(1); minHeap.offer(3);
        System.out.print("Min-Heap poll order: ");
        while (!minHeap.isEmpty()) System.out.print(minHeap.poll() + " ");
        System.out.println();

        // Max-Heap
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        maxHeap.offer(5); maxHeap.offer(1); maxHeap.offer(3);
        System.out.print("Max-Heap poll order: ");
        while (!maxHeap.isEmpty()) System.out.print(maxHeap.poll() + " ");
        System.out.println();
    }

    // ===================== 6. Binary Search Template =====================
    static int binarySearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) return mid;
            else if (arr[mid] < target) left = mid + 1;
            else right = mid - 1;
        }
        return -1; // not found
    }

    // ===================== 7. Two Sum (HashMap pattern) =====================
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

    // ===================== 8. Prefix Sum Pattern =====================
    static int[] prefixSum(int[] arr) {
        int n = arr.length;
        int[] prefix = new int[n];
        prefix[0] = arr[0];
        for (int i = 1; i < n; i++) prefix[i] = prefix[i - 1] + arr[i];
        return prefix;
    }

    // ===================== 9. Sliding Window Max (Deque) =====================
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
