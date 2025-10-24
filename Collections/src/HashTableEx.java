/*Definition

Hashtable<K, V> is a legacy key-value data structure in Java that:

Does not allow null keys or null values.

Synchronized → thread-safe for multiple threads.

Stores unique keys, each mapped to exactly one value.

Internally uses hashing (similar to HashMap but synchronized).
Key Points for Interview:

Thread-safe: Unlike HashMap, all methods are synchronized.

No null key, no null value allowed.

Slower than HashMap due to synchronization overhead.

Mostly replaced by ConcurrentHashMap in modern code.

💡 In interviews, if asked “When would you use Hashtable?”,


"Hashtable is a legacy synchronized map implementation from Java 1.0. I would only use it if I’m working with legacy codebases that already use it, or if I need a quick thread-safe map without introducing external synchronization — though in modern code, I would prefer ConcurrentHashMap for better scalability."
 */
import java.util.*;
public class HashTableEx {
    public static void main(String[] args) {
        Hashtable<Integer, String> table = new Hashtable<>();

        // put
        table.put(1, "A");
        table.put(2, "B");
        System.out.println(table); // {2=B, 1=A} (order not guaranteed)

        // get
        System.out.println(table.get(1)); // A

        // containsKey & containsValue
        System.out.println(table.containsKey(2)); // true
        System.out.println(table.containsValue("B")); // true

        // remove
        table.remove(2);
        System.out.println(table); // {1=A}

        // iteration using entrySet
        for (Map.Entry<Integer, String> entry : table.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }
    }
}
