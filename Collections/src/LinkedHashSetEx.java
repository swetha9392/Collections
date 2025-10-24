/*Definition

LinkedHashSet in Java is a Set implementation that:

Stores unique elements (no duplicates, like HashSet).

Maintains insertion order (unlike HashSet which is unordered).

Backed by a LinkedHashMap internally.

Null is allowed (only one).*/



import java.util.*;
public class LinkedHashSetEx {


    public static void main(String[] args) {
        LinkedHashSet<Integer> set = new LinkedHashSet<>();

        set.add(1);
        set.add(2);
        set.add(3);
        System.out.println("After add: " + set);

        set.addAll(Arrays.asList(3, 4, 5));
        System.out.println("After addAll: " + set);

        set.remove(2);
        set.removeIf(n->n%2==0);
        System.out.println("After remove: " + set);

        set.retainAll(Arrays.asList(3, 4));
        System.out.println("After retainAll: " + set);

        System.out.println("Contains 3? " + set.contains(3));

        Iterator<Integer> it = set.iterator();
        System.out.print("Iteration: ");
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
    }
}
