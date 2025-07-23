package collections.map;


/*
What is Map in Java?
Unlike List or Set, a Map stores key-value pairs.
Keys must be unique, values can be duplicate.

HashMap – The Most Common Map
✅ Stores entries using a hash table
✅ No guaranteed order
✅ Allows one null key, many null values
✅ Not thread-safe

How it works internally (Simplified):
It uses hashCode() of the key to determine bucket index.
Then uses equals() to check for collisions.
If two keys have same hash, it stores them in a LinkedList or Tree (after Java 8, if too many collisions).

| Feature             | HashMap | LinkedHashMap | TreeMap       | IdentityHashMap      |
| ------------------- | ------- | ------------- | ------------- | -------------------- |
| Order               | No      | Insertion     | Sorted by key | No                   |
| Null Keys Allowed   | 1       | 1             | ❌             | ✅                    |
| Null Values Allowed | ✅       | ✅             | ✅             | ✅                    |
| Thread Safe         | ❌       | ❌             | ❌             | ❌                    |
| Uses                | General | LRU cache     | Sorted maps   | Reference comparison |

 */

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {

        Map<String, String> details = new HashMap<>();
        details.put("Pramod", "pramodvaddiraju@gmail.com");
        details.put("Sameera", "sameeramothukuri@gmail.com");
        details.put("Nandan", "nandan@gmail.com");

        System.out.println(details);


    }
}
