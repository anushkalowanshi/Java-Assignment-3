package JavaAssignment3;

import java.util.*;

public class TreeMapDemo {

    public static void main(String[] args) {

        // ===== TreeMap Constructors =====

        TreeMap<Integer, String> tm1 = new TreeMap<>();                       // 1. Default (Natural order)
        TreeMap<Integer, String> tm2 = new TreeMap<>(Comparator.reverseOrder()); // 2. Comparator
        TreeMap<Integer, String> tm3 = new TreeMap<>(tm1);                    // 3. Map
        TreeMap<Integer, String> tm4 = new TreeMap<>(new HashMap<>());         // 4. Map

        // ===== TreeMap Methods =====

        tm1.put(1, "Apple");            // Method 1
        tm1.put(2, "Banana");
        tm1.put(3, "Cherry");

        tm1.putIfAbsent(4, "Dates");    // Method 2

        System.out.println("TreeMap: " + tm1);

        System.out.println("Get key 2: " + tm1.get(2));        // Method 3
        System.out.println("First Key: " + tm1.firstKey());   // Method 4
        System.out.println("Last Key: " + tm1.lastKey());     // Method 5
        System.out.println("Higher Key than 2: " + tm1.higherKey(2)); // Method 6

        tm1.remove(1);                  // Method 7
        System.out.println("After remove: " + tm1);

        tm1.replace(2, "Banana", "Mango"); // Method 8
        System.out.println("After replace: " + tm1);

        tm1.keySet();                   // Method 9
        tm1.values();                   // Method 10
        tm1.entrySet();                 // Method 11

        System.out.println("Size: " + tm1.size());     // Method 12
        System.out.println("Is Empty? " + tm1.isEmpty()); // Method 13
        System.out.println("Equals tm2? " + tm1.equals(tm2)); // Method 14

        tm1.clear();                    // Method 15
        System.out.println("After clear: " + tm1);
    }
}
