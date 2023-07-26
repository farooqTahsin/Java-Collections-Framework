package collection.list;

import java.util.*;

// List implements Collection
public class ListDemo {
    public static void main (String[]args) {
        Collection c = new ArrayList();
        List ls = new ArrayList();

        // Abstract Method In List Interface
        ls.add(new Object()); // From Collection (Add To End)
        ls.add(3, new Object());
        ls.addAll(c); // From Collection (Add To End)
        ls.addAll(2, c);
        ls.remove(new Object()); // From Collection (Add To End)
        ls.remove(5);
        ls.get(2);
        ls.set(2, new Object());
    }
}
