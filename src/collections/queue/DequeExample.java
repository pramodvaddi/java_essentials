package collections.queue;

import java.util.ArrayDeque;
import java.util.Deque;

/*
Deque is a double ended queue.
You can insert and remove elements from both the ends.

| Method        | Description              |
| ------------- | ------------------------ |
| `addFirst()`  | Add element at the front |
| `addLast()`   | Add element at the end   |
| `pollFirst()` | Remove from front        |
| `pollLast()`  | Remove from end          |

 */
public class DequeExample {

    public static void main(String[] args) {
        Deque<Integer> items = new ArrayDeque<>();
        items.add(12);
        items.add(34);
        items.add(43);

    }
}
