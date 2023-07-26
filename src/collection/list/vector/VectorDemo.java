package collection.list.vector;

import java.util.*;

// Dynamic Array
// It is recommended to use the Vector class in the thread-safe implementation only
public class VectorDemo {
    /**
     * The Differences between ArrayList And Vector:
     * 1- Vector is synchronized.
     * 2- Java Vector contains many legacy methods that are not the part of a collections framework.
     */
    public static void main(String[]args) {
        // Declare Vector
//        Vector <Integer> al = new Vector<>();
//        Vector <String> al =new Vector<>();
//        List al = new Vector();
        Vector v = new Vector();

        // Add Elements To Vector
        v.add(100);
        v.add("Farooq");
        v.add(4.5);
        v.add(12.1);
        v.add('F');
        v.add(false);
        v.add(null);

        // Print Vector
        System.out.println(v);

        // Size
        System.out.println("Size Of LinkedList is "+ v.size());

        // Remove Elements
        v.remove(3); // 3 is index
        v.remove("Farooq"); // "farooq" is element
        System.out.println("After Removing : "+ v);

        // Insert A New Element
        v.add(2, "C++");
        System.out.println("After Inserting "+ v);

        // Retrieve Specific Element
        System.out.println(v.get(2));

        // Change Element/Replace
        v.set(2, "Java");
        System.out.println("After Replacing "+ v);

        // Search - Contains
        System.out.println(v.contains("C#"));
        System.out.println(v.contains("Java"));

        // isEmpty
        System.out.println(v.isEmpty());

        // for loop
        System.out.println("Reading Element Using For Loop:");
        for(int i = 0; i< v.size(); i++)
            System.out.print(v.get(i)+" ");
        System.out.println();

        // for each
        System.out.println("Reading Element Using For Each:");
        for(Object o : v)
            System.out.print(o+" ");
        System.out.println();

        // iterator
        System.out.println("Reading Element Using Iterator Method:");
        Iterator it = v.iterator();
        while(it.hasNext())
            System.out.print(it.next()+" ");
        System.out.println();

        // addAll
        LinkedList al2 = new LinkedList();
        al2.add(1);al2.add(2);al2.add(3);
        v.addAll(al2);
        System.out.println("After Add All: "+ v);

        // removeAll
        v.removeAll(al2);
        System.out.println("After Delete All: "+ v);

        // clear
        v.clear();
        System.out.println("After Clear: "+ v);

        // Sort -- Collections.sort()
        v.add('X');
        v.add('Y');
        v.add('Z');
        v.add('A');
        v.add('B');
        System.out.println("Before Sorting: "+ v);
        Collections.sort(v);
        System.out.println("After Sorting: "+ v);

        // Reverse -- Collections.reverse()
        Collections.reverse(v);
        System.out.println("After Reversing: "+ v);

        // Shuffling -- Collections.shuffle()
        Collections.shuffle(v);
        System.out.println("After Shuffling: "+ v);

    }
}
