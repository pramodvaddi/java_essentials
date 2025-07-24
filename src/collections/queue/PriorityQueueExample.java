package collections.queue;

/*
A Queue is a linear data structure that follows the FIFO (First-In-First-Out) principle.

Queue is an interface. Main implementations:
LinkedList (basic FIFO)
PriorityQueue (ordered based on priority)
ArrayDeque (efficient insertion/removal at both ends)

A PriorityQueue is a queue where elements are ordered based on priority, not insertion time.
By default,:
Natural Ordering (ascending for numbers)
Uses Comparable or Comparator for custom order
 */

import java.util.PriorityQueue;

public class PriorityQueueExample {

    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(221);
        pq.add(320);
        pq.add(410);
        System.out.println(pq);

    }
}
