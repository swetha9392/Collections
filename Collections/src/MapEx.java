/*Definition of Map

A Map<K, V> in Java is a key-value data structure where:

Keys are unique (no duplicates allowed — last put() overrides previous value for same key).

Each key maps to exactly one value.

Can have null values (depends on implementation for null keys).


Common Map Implementations

HashMap → Unordered, allows one null key, multiple null values, average O(1) operations.

LinkedHashMap → Maintains insertion order, allows one null key, multiple null values, average O(1).

TreeMap → Sorted by key (natural ordering or comparator), no null key if natural ordering, multiple null values allowed, O(log n) operations.

 */
import java.util.*;
public class MapEx {

    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();

        map.put(1, "A");
        map.put(2, "B");
        map.putIfAbsent(3, "C");

        System.out.println("Map: " + map); // {1=A, 2=B, 3=C}
        System.out.println("Get key 2: " + map.get(2)); // B
        System.out.println("Contains key 1? " + map.containsKey(1)); // true
        System.out.println("Contains value B? " + map.containsValue("B")); // true

        map.replace(2, "BB");
        System.out.println("After replace: " + map); // {1=A, 2=BB, 3=C}

        map.remove(3);
        System.out.println("After remove: " + map); // {1=A, 2=BB}

        System.out.println("Keys: " + map.keySet()); // [1, 2]
        System.out.println("Values: " + map.values()); // [A, BB]
        System.out.println("Entries: " + map.entrySet()); // [1=A, 2=BB]
    }
}
