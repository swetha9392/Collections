import java.util.HashSet;
import java.util.Set;
import java.util.*;


public class HashSetEx {

    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();

        // add()
        set.add(1);
        set.add(2);
        set.add(3);
        System.out.println("Set after add: " + set);

        // addAll()
        Set<Integer> anotherSet = new HashSet<>(Arrays.asList(3, 4, 5));
        set.addAll(anotherSet);
        System.out.println("After addAll: " + set);

        // contains()
        System.out.println("Contains 3? " + set.contains(3));

        // containsAll()
        System.out.println("Contains all [2,3]? " + set.containsAll(Arrays.asList(2, 3)));

        // remove()
        set.remove(4);
        System.out.println("After remove(4): " + set);

        // removeAll()
        set.removeAll(Arrays.asList(5, 6));
        System.out.println("After removeAll([5,6]): " + set);

        // retainAll()
        set.retainAll(Arrays.asList(1, 2));
        System.out.println("After retainAll([1,2]): " + set);

        // size()
        System.out.println("Size: " + set.size());

        // isEmpty()
        System.out.println("Is empty? " + set.isEmpty());

        // iterator()
        System.out.print("Iterating: ");
        Iterator<Integer> it = set.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();

        // clear()
        set.clear();
        System.out.println("After clear: " + set);


        /*Keeps only the elements that are common between the calling collection and the given collection c.

           Removes all other elements from the calling collection.

           In other words:
            callingCollection = callingCollection ∩ c (intersection).

         */

        HashSet<String> copy = new HashSet<>();
        System.out.println("After copy: " + copy);

      //  copy = (HashSet<String>) set.clone();
        System.out.println("HashSet - copy: " + copy);

        /*“Hashing maps data to a fixed-size table using a hash function. The key benefit is O(1) average access time, but collisions must be handled. Java uses separate chaining with linked lists or balanced trees to manage collisions.”*/

    }
}
