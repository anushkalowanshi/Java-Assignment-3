package JavaAssignment3;

import java.util.*;

public class ArrayListDemo {

    public static void main(String[] args) {

        // ===== ArrayList Constructors =====

        // 1. Default constructor
        ArrayList<Integer> list1 = new ArrayList<>();

        // 2. Constructor with initial capacity
        ArrayList<Integer> list2 = new ArrayList<>(10);

        // 3. Constructor with Collection
        ArrayList<Integer> list3 = new ArrayList<>(list1);

        // ===== Adding elements =====
        list1.add(10);                 // Method 1
        list1.add(20);
        list1.add(30);

        list1.add(1, 15);              // Method 2 (add at index)

        // ===== Display elements =====
        System.out.println("List : " + list1);

        // ===== ArrayList Methods =====
        System.out.println("Element at index 2: " + list1.get(2));     // Method 3
        list1.set(2, 25);                                               // Method 4
        System.out.println("After set(): " + list1);

        System.out.println("Size: " + list1.size());                   // Method 5
        System.out.println("Contains 20? " + list1.contains(20));      // Method 6
        System.out.println("Index of 25: " + list1.indexOf(25));       // Method 7
        System.out.println("Is Empty? " + list1.isEmpty());            // Method 8

        list1.remove(1);                                                // Method 9
        System.out.println("After remove(): " + list1);

        list2.addAll(list1);                                            // Method 10
        System.out.println("List2: " + list2);

        list2.removeAll(list1);                                         // Method 11
        System.out.println("List2 after removeAll(): " + list2);

        list1.add(40);
        list1.add(50);

        Object[] arr = list1.toArray();                                 // Method 12
        System.out.println("Array length: " + arr.length);

        Iterator<Integer> it = list1.iterator();                        // Method 13
        System.out.print("Using Iterator: ");
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();

        System.out.println("Equals list3? " + list1.equals(list3));    // Method 14

        list1.clear();                                                  // Method 15
        System.out.println("After clear(): " + list1);
    }
}
