package collections.map;
/*
LinkedHashMap – Ordered HashMap
✅ Keeps insertion order
✅ Slightly slower than HashMap
✅ Good for caches, LRU etc.

| Feature             | HashMap | LinkedHashMap | TreeMap       | IdentityHashMap      |
| ------------------- | ------- | ------------- | ------------- | -------------------- |
| Order               | No      | Insertion     | Sorted by key | No                   |
| Null Keys Allowed   | 1       | 1             | ❌             | ✅                    |
| Null Values Allowed | ✅       | ✅             | ✅             | ✅                    |
| Thread Safe         | ❌       | ❌             | ❌             | ❌                    |
| Uses                | General | LRU cache     | Sorted maps   | Reference comparison |

 */


import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample {
    public static void main(String[] args) {
        Map<String, Integer> users = new LinkedHashMap<>();
        users.put("Pramod", 1990);
        users.put("Sameera", 1992);
        users.put("Nandu", 2024);

        System.out.println(users);
    }
}
