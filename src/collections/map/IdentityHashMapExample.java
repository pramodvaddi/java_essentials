package collections.map;

/*
IdentityHashMap – Based on Reference Equality
✅ Uses == instead of equals() to compare keys
✅ Rare but used in frameworks like JVM's ClassLoader or memory-sensitive tasks

| Feature             | HashMap | LinkedHashMap | TreeMap       | IdentityHashMap      |
| ------------------- | ------- | ------------- | ------------- | -------------------- |
| Order               | No      | Insertion     | Sorted by key | No                   |
| Null Keys Allowed   | 1       | 1             | ❌             | ✅                    |
| Null Values Allowed | ✅       | ✅             | ✅             | ✅                    |
| Thread Safe         | ❌       | ❌             | ❌             | ❌                    |
| Uses                | General | LRU cache     | Sorted maps   | Reference comparison |

 */

import java.util.IdentityHashMap;
import java.util.Map;

public class IdentityHashMapExample {
    public static void main(String[] args) {

        Map<String, String> identityMap = new IdentityHashMap<>();
        String a = new String("Java");
        String b = new String("Java");

        identityMap.put(a, "Lang1");
        identityMap.put(b, "Lang2");

        System.out.println(identityMap.size());
        System.out.println(identityMap);
    }
}
