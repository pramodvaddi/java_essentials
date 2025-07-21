package collections.list;

/*
Stack is LastIn, FirstOut (LIFO) data structure.
Stack extends Vector.
Common operations such as,
push(): Adds to top,
pop(): remove,
peek(): View on top,
empty(): checks if the stack is empty.

Summary:
| Feature          | `ArrayList`     | `Vector`                   | `Stack`                |
| ---------------- | --------------- | -------------------------- | ---------------------- |
| Thread-safe      | ❌ No            | ✅ Yes                      | ✅ Yes (extends Vector) |
| Order maintained | ✅ Yes           | ✅ Yes                      | ✅ Yes                  |
| Synchronization  | ❌               | ✅                          | ✅                      |
| Use case         | Single-threaded | Multi-threaded legacy code | LIFO structure         |


 */

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {

        Stack<String> browser = new Stack<>();
        browser.push("Google.com");
        browser.push("Yahoomail");
        browser.push("Gmail");

        System.out.println(browser);

        System.out.println("Current page is: " + browser.peek());

        browser.pop();
        System.out.println("Back to : " + browser.peek());

    }
}
