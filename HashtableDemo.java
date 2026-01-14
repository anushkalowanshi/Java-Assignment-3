package JavaAssignment3;

import java.util.*;

public class HashtableDemo {

    public static void main(String[] args) {

        // ===== Hashtable Constructors =====

        Hashtable<Integer, String> ht1 = new Hashtable<>();            // 1. Default
        Hashtable<Integer, String> ht2 = new Hashtable<>(10);          // 2. Initial capacity
        Hashtable<Integer, String> ht3 = new Hashtable<>(10, 0.75f);   // 3. Capacity & load factor
        Hashtable<Integer, String> ht4 = new Hashtable<>(ht1);         // 4. Map

        // ===== Hashtable Methods =====

        ht1.put(1, "Java");                 // Method 1
        ht1.put(2, "Python");
        ht1.put(3, "C++");

        ht1.putIfAbsent(4, "SQL");          // Method 2

        System.out.println("Hashtable: " + ht1);

        System.out.println("Get key 2: " + ht1.get(2));                 // Method 3
        System.out.println("Contains key 3? " + ht1.containsKey(3));   // Method 4
        System.out.println("Contains value Java? " + ht1.containsValue("Java")); // Method 5
        System.out.println("Size: " + ht1.size());                      // Method 6

        ht1.remove(1);                      // Method 7
        System.out.println("After remove: " + ht1);

        ht1.replace(2, "Python", "PY");     // Method 8
        System.out.println("After replace: " + ht1);

        Enumeration<Integer> keys = ht1.keys();      // Method 9
        Enumeration<String> values = ht1.elements(); // Method 10

        System.out.print("Keys: ");
        while (keys.hasMoreElements()) {
            System.out.print(keys.nextElement() + " ");
        }
        System.out.println();

        System.out.print("Values: ");
        while (values.hasMoreElements()) {
            System.out.print(values.nextElement() + " ");
        }
        System.out.println();

        ht1.entrySet();                     // Method 11
        System.out.println("Is Empty? " + ht1.isEmpty()); // Method 12
        System.out.println("Equals ht2? " + ht1.equals(ht2)); // Method 13

        ht1.clone();                        // Method 14
        ht1.clear();                        // Method 15

        System.out.println("After clear: " + ht1);
    }
}
