package collection.queue;

import java.util.*;

public class LinkedListDemo {
    // Duplicate is allowed
    // Insertion order is preserved
    // Homogeneous data is allowed
    public static void main(String[]args) {

        Queue q = new LinkedList();

        // add() & offer()
        q.add("A");
        q.add("B");
        q.add("C");
        q.add("D");
        q.offer("D");
        q.offer("C");
        q.offer(12);// ths is allowed (Homogeneous data)

        // Print PriorityQueue
        System.out.println(q); // [A, B, C, C]

        // element() & peek()
        System.out.println(q.element()); // return exception, if q is empty
        System.out.println(q.peek()); // return null, if q is empty

        // remove() & poll()
        System.out.println(q.remove()); // return exception, if q is empty
        System.out.println(q.poll()); // return null, if q is empty

        // for each
        for(Object o : q )
            System.out.print(o+" ");
        System.out.println();

        // iterator
        Iterator it = q.iterator();
        while(it.hasNext())
            System.out.print(it.next()+" ");
    }
}
