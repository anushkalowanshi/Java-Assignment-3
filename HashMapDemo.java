package JavaAssignment3;

import java.util.*;

public class HashMapDemo {

    public static void main(String[] args) {

        // ===== HashMap Constructors =====

        HashMap<Integer, String> hm1 = new HashMap<>();               // 1. Default
        HashMap<Integer, String> hm2 = new HashMap<>(10);             // 2. Capacity
        HashMap<Integer, String> hm3 = new HashMap<>(10, 0.75f);      // 3. Capacity & load factor
        HashMap<Integer, String> hm4 = new HashMap<>(hm1);            // 4. Map

        // ===== HashMap Methods =====

        hm1.put(1, "Java");                   // Method 1
        hm1.put(2, "Python");
        hm1.put(3, "C++");

        hm1.putIfAbsent(4, "SQL");            // Method 2

        System.out.println("HashMap: " + hm1);

        System.out.println("Get key 2: " + hm1.get(2));               // Method 3
        System.out.println("Contains key 3? " + hm1.containsKey(3)); // Method 4
        System.out.println("Contains value Java? " + hm1.containsValue("Java")); // Method 5
        System.out.println("Size: " + hm1.size());                    // Method 6

        hm1.remove(1);                           // Method 7
        System.out.println("After remove: " + hm1);

        hm1.replace(2, "Python", "PY");          // Method 8
        System.out.println("After replace: " + hm1);

        Set<Integer> keys = hm1.keySet();        // Method 9
        Collection<String> values = hm1.values(); // Method 10
        Set<Map.Entry<Integer, String>> entries = hm1.entrySet(); // Method 11

        System.out.println("Keys: " + keys);
        System.out.println("Values: " + values);
        System.out.println("Entries: " + entries);

        System.out.println("Is Empty? " + hm1.isEmpty()); // Method 12
        System.out.println("Equals hm2? " + hm1.equals(hm2)); // Method 13

        hm1.clone();                              // Method 14
        hm1.clear();                              // Method 15

        System.out.println("After clear: " + hm1);
    }
}
