package map.hash_table;

import java.util.*;

public class HashTableDemo {
    /**
     * Synchronized.
     * One Thread Allowed.
     * Thread Safe.
     * Performance Poor.
     * Nulls Can't Accept.
     */
    public static void main(String[]args) {

        // Declare Hashtable
//        Hashtable t = new Hashtable(); // capacity is 11, load factor is 0.75
//        Hashtable t = new Hashtable(initial capacity);
//        Hashtable t = new Hashtable(initial capacity, load factor);
        Hashtable <Integer, String> t = new Hashtable<Integer, String>();

        // inset key and value
        t.put(204, "Farooq");
        t.put(205, "Jad");
        t.put(206, "Tarek");
        t.put(123, "x");
//        t.put(null, "abc"); // Runtime Error
//        t.put(206, null); // Runtime Error

        // Print Hashtable
        System.out.println(t);

        // get(key)
        System.out.println(t.get(204)); // Farooq

        // remove(key)
        t.remove(123);
        System.out.println(t); // {214=Farooq, 215=Jad, 216=Leen, 217=Majd, 218=Tarek}

        // containsKey(key)
        System.out.println(t.containsKey(204)); // true
        System.out.println(t.containsKey(123)); // false

        // containsValue(value)
        System.out.println(t.containsValue("Farooq")); // true
        System.out.println(t.containsValue("abc")); // false

        // isEmpty()
        System.out.println(t.isEmpty());

        // keySet()
        System.out.println(t.keySet()); // return Set Object contains all keys from the map

        // values()
        System.out.println(t.values()); // return Collection Object contains all values from map

        // for each
        for(int k : t.keySet()) {
            System.out.println(k+" : "+t.get(k));
        }

        // Entry specific methods
        for(Map.Entry entry : t.entrySet()) {
            System.out.println(entry.getKey()+" | "+entry.getValue());
        }

        // iterator
        Set s = t.entrySet();
        Iterator it = s.iterator();
        while(it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            System.out.println(entry.getKey()+"="+entry.getValue());
        }
    }
}
