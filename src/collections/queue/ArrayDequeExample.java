package collections.queue;

/*
ArrayDeque in Java
A resizable array implementation of Deque
Faster than Stack and LinkedList
Can be used as Stack (LIFO) or Queue (FIFO)

| Topic               | Tip                                                              |
| ------------------- | ---------------------------------------------------------------- |
| `PriorityQueue`     | Internally backed by a binary heap                               |
| `ArrayDeque`        | No capacity restrictions; better than Stack                      |
| Thread Safety       | None of the above are thread-safe by default                     |
| Use in Real Systems | Queues in OS (process scheduling), DB (request queues), printers |



 */

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeExample {
    public static void main(String[] args) {
        Deque<String> pages = new ArrayDeque<>();
        pages.addFirst("Google");
        pages.add("Yahoo");
        pages.add("Facebook");
        pages.addLast("Instagram");


        System.out.println(pages);

        System.out.println(pages.poll());
        System.out.println(pages.pollLast());


    }
}
