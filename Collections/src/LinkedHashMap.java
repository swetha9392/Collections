/*Definition

LinkedHashMap is a HashMap with a doubly linked list running through all entries.

Maintains insertion order (default) or access order (if accessOrder = true in constructor).

Allows one null key and multiple null values.

Average case operations are O(1) (like HashMap), but iteration preserves order.

Key Points about LinkedHashMap

Ordering: Maintains the order in which keys were inserted (unless accessOrder = true, then it maintains last-access order).

Performance: Almost same as HashMap for average cases, but has a slight overhead due to the doubly linked list.

Nulls: 1 null key allowed, multiple null values allowed.

Iteration: Iterates in predictable order (important for caching and LRU implementations).

How to use this in interviews

Remember: LinkedHashMap = predictable order + O(1) operations average.

Mention it’s often used for LRU cache because of accessOrder=true.

 */
import java.util.*;
public class LinkedHashMap {
    public static void main(String[] args) {
        // Create LinkedHashMap
        LinkedHashMap<Integer, String> map = new LinkedHashMap<>();

        // put()
        map.put(1, "A");
        map.put(2, "B");
        map.put(3, "C");
        System.out.println("After put: " + map); // {1=A, 2=B, 3=C}

        // get()
        System.out.println("Get key 2: " + map.get(2)); // B

        // putIfAbsent()
        map.putIfAbsent(4, "D");
        map.putIfAbsent(2, "Z"); // Won't replace existing key
        System.out.println("After putIfAbsent: " + map); // {1=A, 2=B, 3=C, 4=D}

        // containsKey() & containsValue()
        System.out.println("Contains key 3? " + map.containsKey(3)); // true
        System.out.println("Contains value 'C'? " + map.containsValue("C")); // true

        // replace(K, V)
        map.replace(1, "AA");
        System.out.println("After replace(1, 'AA'): " + map); // {1=AA, 2=B, 3=C, 4=D}

        // replace(K, oldValue, newValue)
        map.replace(2, "B", "BB");
        System.out.println("After replace(2, 'B', 'BB'): " + map); // {1=AA, 2=BB, 3=C, 4=D}

        // remove(key)
        map.remove(4);
        System.out.println("After remove(4): " + map); // {1=AA, 2=BB, 3=C}

        // remove(key, value)
        map.remove(3, "X"); // Won’t remove, value doesn’t match
        map.remove(3, "C"); // Will remove
        System.out.println("After conditional remove(3, 'C'): " + map); // {1=AA, 2=BB}

        // keySet()
        System.out.println("Keys: " + map.keySet()); // [1, 2]

        // values()
        System.out.println("Values: " + map.values()); // [AA, BB]

        // entrySet()
        System.out.println("Entries: " + map.entrySet()); // [1=AA, 2=BB]

        // size()
        System.out.println("Size: " + map.size()); // 2

        // isEmpty()
        System.out.println("Is empty? " + map.isEmpty()); // false

        // clear()
        map.clear();
        System.out.println("After clear: " + map); // {}
    }
}
