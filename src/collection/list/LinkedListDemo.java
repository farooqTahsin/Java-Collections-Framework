package collection.list;

import java.util.*;

// LinkedList implements List, Deque
// Stack FILO --> Stack <Integer> s = new Stack<>();
// Queue FIFO --> Queue <Integer> q = new LinkedList<>();

// Best For Insertion/Deletion Objects
public class LinkedListDemo {
    public static void main(String[]args) {

        // Declare LinkedList
//        LinkedList <Integer> al = new LinkedList<>();
//        LinkedList <String> al =new LinkedList<>();
//        List al = new LinkedList();
        LinkedList ls = new LinkedList();

        // Add Elements To LinkedList
        ls.add(100);
        ls.add("Farooq");
        ls.add(4.5);
        ls.add(12.1);
        ls.add('F');
        ls.add(false);
        ls.add(null);

        // Print LinkedList
        System.out.println(ls);

        // Size
        System.out.println("Size Of LinkedList is "+ ls.size());

        // Remove Elements
        ls.remove(3); // 3 is index
        ls.remove("Farooq"); // "farooq" is element
        System.out.println("After Removing : "+ ls);

        // Insert A New Element
        ls.add(2, "C++");
        System.out.println("After Inserting "+ ls);

        // Retrieve Specific Element
        System.out.println(ls.get(2));

        // Change Element/Replace
        ls.set(2, "Java");
        System.out.println("After Replacing "+ ls);

        // Search - Contains
        System.out.println(ls.contains("C#"));
        System.out.println(ls.contains("Java"));

        // isEmpty
        System.out.println(ls.isEmpty());

        // for loop
        System.out.println("Reading Element Using For Loop:");
        for(int i = 0; i< ls.size(); i++)
            System.out.print(ls.get(i)+" ");
        System.out.println();

        // for each
        System.out.println("Reading Element Using For Each:");
        for(Object o : ls)
            System.out.print(o+" ");
        System.out.println();

        // iterator
        System.out.println("Reading Element Using Iterator Method:");
        Iterator it = ls.iterator();
        while(it.hasNext())
            System.out.print(it.next()+" ");
        System.out.println();

        // addAll
        LinkedList al2 = new LinkedList();
        al2.add(1);al2.add(2);al2.add(3);
        ls.addAll(al2);
        System.out.println("After Add All: "+ ls);

        // removeAll
        ls.removeAll(al2);
        System.out.println("After Delete All: "+ ls);

        // clear
        ls.clear();
        System.out.println("After Clear: "+ ls);

        // Sort -- Collections.sort()
        ls.add('X');
        ls.add('Y');
        ls.add('Z');
        ls.add('A');
        ls.add('B');
        System.out.println("Before Sorting: "+ ls);
        Collections.sort(ls);
        System.out.println("After Sorting: "+ ls);

        // Reverse -- Collections.reverse()
        Collections.reverse(ls);
        System.out.println("After Reversing: "+ ls);

        // Shuffling -- Collections.shuffle()
        Collections.shuffle(ls);
        System.out.println("After Shuffling: "+ ls);

        // Convert Array To LinkedList
        String arr[] = {"Farooq", "Ali", "Essa"};
        System.out.print("Elements Of Array: ");
        for(String s:arr)
            System.out.print(s+" ");
        System.out.println();
        LinkedList arrayList = new LinkedList(Arrays.asList(arr));
        System.out.print("Elements Of LinkedList: ");
        System.out.println(arrayList);

        // addFirst addLast removeFirst removeLast getFirst getLast
        LinkedList <String> stringList = new LinkedList<>();
        stringList.add("dog");
        stringList.add("dog");
        stringList.add("cat");
        stringList.add("horse");
        System.out.println(stringList); // [dog, dog, cat, horse]
        stringList.addFirst("Tiger");
        stringList.addLast("Elephant");
        System.out.println(stringList); // [Tiger, dog, dog, cat, horse, Elephant]
        System.out.println(ls.getFirst()); // Tiger
        System.out.println(ls.getLast()); // Elephant
        stringList.removeFirst();
        stringList.removeLast();
        System.out.println("After Removing " + stringList); // [dog, dog, cat, horse]
    }
}
