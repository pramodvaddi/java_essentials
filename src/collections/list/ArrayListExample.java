package collections.list;

/*
Key Features of List:
| Feature            | Description                      |
| ------------------ | -------------------------------- |
| Ordered            | Maintains insertion order        |
| Allows duplicates  | You can store duplicate elements |
| Index-based access | Access via `get(index)`          |
| Modifiable         | Add/remove/replace elements      |

Common Implementations:
    | Class        | Backed By                  | Best For                             |
| ------------ | -------------------------- | ------------------------------------ |
| `ArrayList`  | Dynamic array              | Frequent reads, rare inserts/deletes |
| `LinkedList` | Doubly-linked list         | Frequent inserts/deletes             |
| `Vector`     | Legacy class (thread-safe) | When thread-safety is needed         |

Summary Table:
| Feature         | `List` Interface              |
| --------------- | ----------------------------- |
| Ordering        | Maintains insertion order     |
| Duplicates      | Allowed                       |
| Access by index | Yes                           |
| Implementations | ArrayList, LinkedList, Vector |

Array List in Java
ArrayList is a resizable array implementation of the List interface.

| Feature                     | Description                                  |
| --------------------------- | -------------------------------------------- |
| Dynamic resizing            | Grows automatically as you add more elements |
| Fast random access          | O(1) for `get(index)`                        |
| Slower for inserts/removals | Especially in middle or beginning            |
| Allows duplicates           | Yes                                          |
| Maintains insertion order   | Yes                                          |

Constructors of Array List
ArrayList<Integer> list1 = new ArrayList<>();         // Default size 10
ArrayList<String> list2 = new ArrayList<>(20);        // Initial capacity 20
ArrayList<String> list3 = new ArrayList<>(list2);     // Copy from another list

Internal Working of ArrayList
1) Internally uses an Object[] array.
2) Default capacity = 10.
3) When size exceeds capacity, it creates a new array with 1.5x size, copies all elements, and discards the old one.

When to Use ArrayList:
1) When you want fast access using index
2) When you have more reads than writes
3) When you want to preserve insertion order

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

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> carBrands = new ArrayList<>();
        carBrands.add("Hyundai");
        carBrands.add("Toyota");
        carBrands.add("Mercedes");
        carBrands.add("BMW");

        System.out.println(carBrands);

        //To print by index
        System.out.println(carBrands.get(0));

        // To remove an item
        System.out.println(carBrands.remove("Toyota"));

        // To set an item
        System.out.println(carBrands.set(1,"Porsche"));
        System.out.println(carBrands);
    }
}
