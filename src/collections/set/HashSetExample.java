package collections.set;

import java.util.HashSet;

/*
A Set is a collection that does not allow duplicate elements.

Types of Sets:
| Set Type        | Order Maintained  | Sorted | Allows null | Backed By                |
| --------------- | ----------------- | ------ | ----------- | ------------------------ |
| `HashSet`       | ❌ No              | ❌ No   | ✅ Yes       | Hash table               |
| `LinkedHashSet` | ✅ Yes (insertion) | ❌ No   | ✅ Yes       | Hash table + Linked list |
| `TreeSet`       | ✅ Yes (sorted)    | ✅ Yes  | ❌ No        | Red-Black Tree           |

| Feature           | Description                                          |
| ----------------- | ---------------------------------------------------- |
| Allows duplicates | ❌ No                                                 |
| Null element      | ✅ One allowed                                        |
| Order maintained  | ❌ No                                                 |
| Thread-safe       | ❌ No (use `Collections.synchronizedSet()` if needed) |
| Backed by         | `HashMap`                                            |
| Performance       | Fast for add, remove, contains – O(1) on average     |

Key Differences:
| Feature                | HashSet   | LinkedHashSet | TreeSet       |
| ---------------------- | --------- | ------------- | ------------- |
| Duplicate allowed?     | ❌ No      | ❌ No          | ❌ No          |
| Maintains insertion?   | ❌ No      | ✅ Yes         | ❌ No (sorted) |
| Sorted?                | ❌ No      | ❌ No          | ✅ Yes         |
| Performance (avg case) | ✅ Fastest | ✅ Fast        | ❗ Slower      |
| Internal structure     | HashMap   | LinkedHashMap | TreeMap       |



 */

public class HashSetExample {

    public static void main(String[] args) {
        HashSet<String> emails = new HashSet<>();
        emails.add("pramodvaddiraju@gmail.com");
        emails.add("pramodvaddi@gmail.com");
        emails.add("sameeramothukuri@gmail.com");
        emails.add("pramodvaddiraju@gmail.com");

        for(String email: emails){
            System.out.println(email);
        }
        System.out.println(emails);


    }
}
