package collections.list;

/*
Vector is a resizable array, just like an ArrayList. This was introduced before ArrayList in Java 1.0.
Vector is thread safe.

Characteristics:
| Feature               | Description            |
| --------------------- | ---------------------- |
| Synchronization       | Yes, thread-safe       |
| Growable array        | Grows when needed      |
| Slower than ArrayList | Due to synchronization |
| Allows duplicates     | Yes                    |
| Maintains order       | Yes                    |


 */

import java.util.Vector;

public class VectorExample {

    public static void main(String[] args) {

        Vector<String> notes = new Vector<>();
        notes.add("Flowers");
        notes.add("Waterfalls");
        notes.add("Milkyway");

        System.out.println(notes);

        notes.remove("Milkyway");
        System.out.println(notes);

    }
}
