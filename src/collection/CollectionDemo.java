/*
    - Iterable (I)
        - Collection (I)
            - List (I)
                - ArrayList
                - LinkedList
                - Vector
                    - Stack
            - Queue (I)
                - PriorityQueue
                - Deque (I)
                    - ArrayDeque
                    - LinkedList
            - Set (I)
                - HashSet
                - LinkedHashSet
                - SortedSet (I)
                    - TreeSet

    Collection (Interface)
    Collections (Class) Contains method that use for collection objects.
*/
package collection;
import java.util.*;
public class CollectionDemo {
    public static void main(String[] args) {

        Collection c = new ArrayList();
        Collection c2 = new ArrayList();

        // Abstract Method In Collection Interface
        c.add(new Object());
        c.addAll(c2);
        c.remove(new Object());
        c.removeAll(c2);
        c.clear();
        c.isEmpty();
        c.size();
        c.contains(new Object());
        c.containsAll(c2);
        c.toArray();
    }
}
