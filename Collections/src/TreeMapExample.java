/* Definition

A TreeMap in Java:

Implements the NavigableMap interface.

Stores key–value pairs in a Red-Black Tree (self-balancing BST).

Keys are sorted (by natural order or a Comparator provided at construction).

No null keys if using natural ordering, but null values allowed.

All major operations (put, get, remove, containsKey) → O(log n).*/
import java.util.*;

public class TreeMapExample {
    public static void main(String[] args) {
        TreeMap<Integer, String> map = new TreeMap<>();

        map.put(2, "B");
        map.put(1, "A");
        map.put(3, "C");

        System.out.println("Map: " + map); // {1=A, 2=B, 3=C}
        System.out.println("First Key: " + map.firstKey()); // 1
        System.out.println("Last Key: " + map.lastKey()); // 3
        System.out.println("HeadMap(3): " + map.headMap(3)); // {1=A, 2=B}
        System.out.println("TailMap(2): " + map.tailMap(2)); // {2=B, 3=C}
        System.out.println("SubMap(1,3): " + map.subMap(1, 3)); // {1=A, 2=B}
    }
}
