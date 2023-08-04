package map.hash_map;

import java.util.*;

public class HashMapDemo {
    /**
     * Non-Synchronized.
     * Multiple Thread Allowed.
     * Not Thread Safe.
     * Performance Faster.
     * Null Is Accepted.
     */
    public static void main(String[]args) {

        // Declare HashMap
//        HashMap mp = new HashMap();
        HashMap <Integer,String> mp = new HashMap<Integer,String>();

        // inset key and value
        mp.put(214, "Farooq");
        mp.put(215, "Ali");
        mp.put(216, "Leen");
        mp.put(217, "Majd");
        mp.put(218, "Tarek");
        mp.put(215, "Jad"); // The Previous Value Of The Key 215 Will Jad (The Key Is Unique)
        mp.put(123, "abc");

        // Print HashMAp
        System.out.println(mp); // {214=Farooq, 215=Jad, 216=Leen, 217=Majd, 218=Tarek, 123=abc}

        // get(key)
        System.out.println(mp.get(214)); // Farooq

        // remove(key)
        mp.remove(123);
        System.out.println(mp); // {214=Farooq, 215=Jad, 216=Leen, 217=Majd, 218=Tarek}

        // containsKey(key)
        System.out.println(mp.containsKey(214)); // true
        System.out.println(mp.containsKey(123)); // false

        // containsValue(value)
        System.out.println(mp.containsValue("Farooq")); // true
        System.out.println(mp.containsValue("abc")); // false

        // isEmpty()
        System.out.println(mp.isEmpty());

        // keySet()
        System.out.println(mp.keySet()); // return Set Object contains all keys from the map

        // keySet() using for each
        for(Object i : mp.keySet()) {
            System.out.print(i+" ");
        }
        System.out.println();

        // values()
        System.out.println(mp.values()); // return Collection Object contains all values from map

        // values() using for each
        for(Object i : mp.values()) {
            System.out.print(i+" ");
        }
        System.out.println();

        // entrySet()
        System.out.println(mp.entrySet()); // return Set Object contains all keys and values from map

        // entrySet() using for each
        for(Object i : mp.keySet()) {
            System.out.print(i+" "+mp.get(i)+", ");
        }
        System.out.println();

        // Entry methods
        for(Map.Entry entry : mp.entrySet()) {
            System.out.println(entry.getKey()+" | "+ entry.getValue());
        }

        // iterator
        Set s = mp.entrySet();
        Iterator it = s.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            System.out.println(entry.getKey()+"="+entry.getValue());
        }
    }
}
