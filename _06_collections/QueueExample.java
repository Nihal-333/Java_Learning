package _06_collections;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<String>tasks= new LinkedList<>();
        
        tasks.offer("Task 1");
        tasks.offer("Task 2");
        tasks.offer("Task 3");
        tasks.offer("Task 4");

        System.out.println("Task Queue: " + tasks);

        System.out.println("Next Task: " + tasks.poll());
        System.out.println("Remaining Tasks: " + tasks);

        System.out.println("Next Task: " + tasks.poll());
        System.out.println("Remaining Tasks: " + tasks);

        System.out.println("Queue size : "+tasks.size());
    }
}
