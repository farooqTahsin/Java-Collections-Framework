/*
     - Map (I)
        - SortedMap (I)
            - NavigableMap (I)
                - TreeMap
        - AbstractMap
            - TreeMap
            - HashMap
                - LinkedHashMap
            - EnumMap
        - HashTable
 */
package map;
import java.util.*;
public class MapDemo {
    /*
        * HashTable
        * Insertion Order Is Not Preserved
        * Duplicate Key Is Not Allowed
        * Duplicate Value Is Allowed
        * Null Key Is Allowed Only Once
        * Null Value Is Allowed Multiple
     */
    public static void main(String[]args) {

        HashMap <Integer, String>mp = new HashMap<>();
        mp.put(1,"farooq");
        mp.putAll(new HashMap());
        mp.get(1); // return value 21of key 1
        mp.remove(1);
        mp.containsKey(1);
        mp.containsValue("farooq");
        mp.isEmpty();
        mp.size();
        mp.clear();
        mp.keySet(); // return Set Object contains all keys from the map
        mp.values(); // return Collection Object contains all values from map
        mp.entrySet(); // return Set Object contains all keys and values from map

    }
}
