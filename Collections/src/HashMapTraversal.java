import java.util.*;

public class HashMapTraversal {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Cherry");

        // 1. keySet()
        System.out.println("Using keySet():");
        for (Integer key : map.keySet()) {
            System.out.println("Key: " + key + ", Value: " + map.get(key));
        }

        // 2. values()
        System.out.println("\nUsing values():");
        for (String value : map.values()) {
            System.out.println("Value: " + value);
        }

        // 3. entrySet()
        System.out.println("\nUsing entrySet():");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        // 4. forEach lambda
        System.out.println("\nUsing forEach lambda:");
        map.forEach((key, value) -> System.out.println(key + " => " + value));

        // 5. Iterator over keySet
        System.out.println("\nIterator over keySet:");
        Iterator<Integer> keyIterator = map.keySet().iterator();
        while (keyIterator.hasNext()) {
            Integer key = keyIterator.next();
            System.out.println(key + " : " + map.get(key));
        }

        // 6. Iterator over entrySet
        System.out.println("\nIterator over entrySet:");
        Iterator<Map.Entry<Integer, String>> entryIterator = map.entrySet().iterator();
        while (entryIterator.hasNext()) {
            Map.Entry<Integer, String> entry = entryIterator.next();
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }
}
