/*
Definition

TreeSet in Java is a Set implementation that:

Stores unique elements (no duplicates, like HashSet).

Maintains elements in sorted order (natural order or via a Comparator).

Backed by a TreeMap internally (Red-Black Tree).

Null is not allowed for non-empty sets (NullPointerException for comparisons).

All major operations take O(log n) time because of tree traversal.*/


import java.util.*;

public class TreeSetEx {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>();

        set.add(4);
        set.add(2);
        set.add(3);
        set.add(1);
        System.out.println("After add: " + set);

        set.remove(2);
        System.out.println("After remove: " + set);

        System.out.println("First element: " + set.first());
        System.out.println("Last element: " + set.last());

        System.out.println("HeadSet(3): " + set.headSet(3));
        System.out.println("TailSet(3): " + set.tailSet(3));
        System.out.println("SubSet(2, 4): " + set.subSet(2, 4));

        System.out.println("Descending order: " + set.descendingSet());
    }
}
