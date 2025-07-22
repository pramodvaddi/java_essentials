package collections.set;
/*
Key Points:
Inherits from HashSet
Maintains insertion order
No duplicate elements
Internally backed by a LinkedHashMap

| Feature                | HashSet   | LinkedHashSet | TreeSet       |
| ---------------------- | --------- | ------------- | ------------- |
| Duplicate allowed?     | ❌ No      | ❌ No          | ❌ No          |
| Maintains insertion?   | ❌ No      | ✅ Yes         | ❌ No (sorted) |
| Sorted?                | ❌ No      | ❌ No          | ✅ Yes         |
| Performance (avg case) | ✅ Fastest | ✅ Fast        | ❗ Slower      |
| Internal structure     | HashMap   | LinkedHashMap | TreeMap       |




 */

import java.util.LinkedHashSet;

public class LinkedHashSetExample {

    public static void main(String[] args) {
        LinkedHashSet<String> visitors = new LinkedHashSet<>();
        visitors.add("John");
        visitors.add("Mike");
        visitors.add("Nanny");
        visitors.add("John");

        System.out.println(visitors);




    }
}
