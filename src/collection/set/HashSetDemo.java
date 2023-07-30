package collection.set;

import java.util.*;

// initial capacity of hashmap is 16
// the initial value of load factor is 0.75

public class HashSetDemo {
    // Duplicate is not allowed
    // Insertion order is not preserved
    public static void main(String[]args) {

        // Declare HashSet
//        Set hs = new HashSet();
//        HashSet hs = new HashSet(100, 0.95f);
//        HashSet<Integer> hs = new HashSet<>();
        HashSet hs = new HashSet();

        // Add Elements To HashSet
        hs.add(100);
        hs.add("farooq");
        hs.add(10.2);
        hs.add('f');
        hs.add(false);
        hs.add(null);

        // Print HashSet
        System.out.println(hs); // random order (insertion order not preserved)

        // Remove Elements
        hs.remove('f');
        System.out.println("After Removing: "+hs);

        // Contains Element
        System.out.println(hs.contains("farooq")); // true
        System.out.println(hs.contains(123)); // false

        // isEmpty()
        System.out.println(hs.isEmpty()); // false

        // for each
        System.out.println("Reading Objects Using for each: ");
        for(Object o : hs)
            System.out.print(o+" ");
        System.out.println();

        // iterator
        System.out.println("Reading Element Using Iterator Method:");
        Iterator it = hs.iterator();
        while(it.hasNext())
            System.out.print(it.next()+" ");
        System.out.println();

        // addAll() removeAll()
        HashSet even = new HashSet();
        even.add(12);
        even.add(2);
        even.add(16);
        System.out.println("even: "+even);
        HashSet numbers = new HashSet();
        numbers.addAll(even);
        numbers.add(9);
        numbers.add(3);
        System.out.println("numbers: "+numbers);
        numbers.removeAll(even);
        System.out.println("After Removing "+numbers);


        // Union, Intersection, Difference, Subset
        HashSet<Integer> set1 = new HashSet<>();
        set1.add(1);set1.add(2);set1.add(3);set1.add(4);set1.add(5);
        System.out.println("set1: "+set1);
        HashSet<Integer> set2 = new HashSet<>();
        set2.add(3);set2.add(4);set2.add(5);
        System.out.println("set2: "+set2);

        // Union
//        set1.addAll(set2);
//        System.out.println("Union: "+set1); // [1, 2, 3, 4, 5]

        // Intersection
//        set1.retainAll(set2);
//        System.out.println("Intersection: "+set1); // [3, 4, 5]

        // Difference
//        set1.removeAll(set2);
//        System.out.println("Difference: "+set1); // [1, 2]

        // Subset
        System.out.println("Is set2 a subset of set1? "+set1.containsAll(set2)); // true

    }
}
