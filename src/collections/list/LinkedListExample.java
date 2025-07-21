package collections.list;

import java.util.LinkedList;

/*
LinkedList is a doubly-linked list implementation of the List and Deque interfaces.

Key Characteristics:
    | Feature                   | Description                                    |
| ------------------------- | ---------------------------------------------- |
| Doubly-linked nodes       | Each element is connected to previous and next |
| Fast insertion/removal    | Especially at beginning or middle              |
| Slow access by index      | No direct access like arrays                   |
| Allows duplicates         | Yes                                            |
| Maintains insertion order | Yes                                            |

Internal Working:
LinkedList uses a chain of nodes.
Each node contains:
data
reference to next and previous nodes

ArrayList vs LinkedList
| Feature                 | `ArrayList`           | `LinkedList`                   |
| ----------------------- | --------------------- | ------------------------------ |
| Backed by               | Dynamic array         | Doubly-linked list             |
| Access (get)            | O(1)                  | O(n)                           |
| Insert/remove at end    | Fast (Amortized O(1)) | Fast (O(1))                    |
| Insert/remove in middle | Slow (O(n))           | Faster (O(n), but no shifting) |
| Memory usage            | Less                  | More (pointers per node)       |
| Thread-safe             | No                    | No                             |
| Use case                | Frequent reads        | Frequent inserts/removals      |


When to use what:
| Use case                            | Preferred  |
| ----------------------------------- | ---------- |
| Fast random access by index         | ArrayList  |
| Many insertions/deletions in middle | LinkedList |
| Memory-efficient bulk storage       | ArrayList  |
| Need to act like a queue or stack   | LinkedList |



 */
public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> tasks = new LinkedList<>();

        tasks.add("Math homework");
        tasks.add("Science homework");
        tasks.add("Social homework");

        System.out.println(tasks);

        tasks.addFirst("Java homework");
        tasks.addLast("Swift Programming tasks");

        System.out.println(tasks);

        tasks.remove("Social homework");
        System.out.println("After removing Social homework from the tasks: " + tasks);
    }





}
