import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {
        // Create Vector
        Vector<String> vector = new Vector<>();

        // add(E element) → Amortized O(1)
        vector.add("Apple");
        vector.add("Banana");

        // add(int index, E element) → O(n)
        vector.add(1, "Mango");

        // addAll(Collection) → O(n + m)
        Vector<String> moreFruits = new Vector<>();
        moreFruits.add("Grapes");
        moreFruits.add("Pineapple");
        vector.addAll(moreFruits);

        // get(int index) → O(1)
        System.out.println("Element at index 2: " + vector.get(2));

        // set(int index, E element) → O(1)
        vector.set(0, "Strawberry");

        // remove(int index) 0→ O(n)
        vector.remove(3);

        // Final Output
        System.out.println("Final Vector: " + vector);


        System.out.println(vector.capacity());
        vector.ensureCapacity(50);
        System.out.println(vector.capacity());

    }
}
