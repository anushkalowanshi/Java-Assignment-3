package JavaAssignment3;

import java.util.*;

public class VectorDemo {

    public static void main(String[] args) {

        // ===== Vector Constructors =====

        Vector<String> v1 = new Vector<>();           // 1. Default
        Vector<String> v2 = new Vector<>(5);          // 2. Initial capacity
        Vector<String> v3 = new Vector<>(5, 2);       // 3. Capacity & increment
        Vector<String> v4 = new Vector<>(v1);         // 4. Collection

        // ===== Vector Methods =====

        v1.add("Java");                    // Method 1
        v1.add("Python");
        v1.addElement("C++");              // Method 2
        v1.insertElementAt("SQL", 1);      // Method 3

        System.out.println("Vector: " + v1);

        System.out.println("Element at index 0: " + v1.get(0));   // Method 4
        System.out.println("First Element: " + v1.firstElement()); // Method 5
        System.out.println("Last Element: " + v1.lastElement());   // Method 6

        v1.remove("Python");               // Method 7
        v1.removeElementAt(0);             // Method 8

        System.out.println("After remove: " + v1);

        System.out.println("Size: " + v1.size());      // Method 9
        System.out.println("Capacity: " + v1.capacity()); // Method 10
        System.out.println("Contains SQL? " + v1.contains("SQL")); // Method 11
        System.out.println("Is Empty? " + v1.isEmpty()); // Method 12

        Enumeration<String> e = v1.elements();          // Method 13
        while (e.hasMoreElements()) {
            System.out.println("Element: " + e.nextElement());
        }

        System.out.println("Equals v2? " + v1.equals(v2)); // Method 14

        v1.clear();                                      // Method 15
        System.out.println("After clear: " + v1);
    }
}
