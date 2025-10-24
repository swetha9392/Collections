import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        // Create Stack
        Stack<String> stack = new Stack<>();

        // push(E element) → Amortized O(1)
        stack.push("Apple");
        stack.push("Banana");
        stack.push("Mango");

        // peek() → O(1) (just returns top element without removing)
        System.out.println("Top element (peek): " + stack.peek());

        // pop() → O(1) (removes top element)
        stack.pop();
        System.out.println("After pop: " + stack);

        // search(Object o) → O(n) (searches from top)
        System.out.println("Position of Banana: " + stack.search("Banana"));

        // isEmpty() → O(1)
        System.out.println("Is stack empty? " + stack.isEmpty());
    }
}
