// queue

// Follows FIFO (First In First Out)
// 1. Enqueue: Adds data to the tail of queue.
// 2. Dequeue: Removes data from the front of queue.

// In collection framework Queue is interface and is implemented by
// LinkedList, ArrayDeque and PriorityQueue

import java.util.*;

public class Class19_2 {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<Integer>();
        q.add(18);
        q.offer(66);
        q.add(45);
        q.offer(90);

        System.out.println(q);

        int p = q.peek();
        System.out.println("Peek result: " + p);
        System.out.println("Queue after peek operation: " + q);

        p = q.poll();
        System.out.println("Poll result: " + p);
        System.out.println("Queue after poll operation: " + q);

        p = q.element(); // it throws exception if queue is empty;
        System.out.println("Element operation result: " + p);
        System.out.println("Queue after element operation: " + q);

        // Queue<Integer> q2 = new ArrayDeque<>();

    }
}
