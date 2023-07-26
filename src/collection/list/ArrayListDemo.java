package collection.list;

import java.util.*;

// ArrayList implements List
// initial capacity of arraylist is 10

// Best For Retrieving Objects
public class ArrayListDemo {
    public static void main (String[]args) {

        // Declare ArrayList
//        ArrayList <Integer> al = new ArrayList<>();
//        ArrayList <String> al =new ArrayList<>();
//        List al = new ArrayList();
        ArrayList al = new ArrayList();

        // Add Elements To ArrayList
        al.add(100);
        al.add("Farooq");
        al.add(4.5);
        al.add(12.1);
        al.add('F');
        al.add(false);

        // Print ArrayList
        System.out.println(al);

        // Size
        System.out.println("Size Of ArrayList is "+al.size());

        // Remove Elements
        al.remove(3); // 3 is index
        al.remove("Farooq"); // "farooq" is element
        System.out.println("After Removing : "+al);

        // Insert A New Element
        al.add(2, "C++");
        System.out.println("After Inserting "+ al);

        // Retrieve Specific Element
        System.out.println(al.get(2));

        // Change Element/Replace
        al.set(2, "Java");
        System.out.println("After Replacing "+al);

        // Search - Contains
        System.out.println(al.contains("C#"));
        System.out.println(al.contains("Java"));

        // isEmpty
        System.out.println(al.isEmpty());

        // for loop
        System.out.println("Reading Element Using For Loop:");
        for(int i=0;i<al.size();i++)
            System.out.print(al.get(i)+" ");
        System.out.println();

        // for each
        System.out.println("Reading Element Using For Each:");
        for(Object o : al )
            System.out.print(o+" ");
        System.out.println();

        // iterator
        System.out.println("Reading Element Using Iterator Method:");
        Iterator it = al.iterator();
        while(it.hasNext())
            System.out.print(it.next()+" ");
        System.out.println();

        // addAll
        ArrayList al2 = new ArrayList();
        al2.add(1);al2.add(2);al2.add(3);
        al.addAll(al2);
        System.out.println("After Add All: "+al);

        // removeAll
        al.removeAll(al2);
        System.out.println("After Delete All: "+al);

        // clear
        al.clear();
        System.out.println("After Clear: "+al);

        // Sort -- Collections.sort()
        al.add('X');al.add('Y');al.add('Z');al.add('A');al.add('B');
        System.out.println("Before Sorting: "+al);
        Collections.sort(al);
        System.out.println("After Sorting: "+al);

        // Reverse -- Collections.reverse()
        Collections.reverse(al);
        System.out.println("After Reversing: "+al);

        // Shuffling -- Collections.shuffle()
        Collections.shuffle(al);
        System.out.println("After Shuffling: "+al);

        // Convert Array To ArrayList
        String arr[] = {"Farooq", "Ali", "Essa"};
        System.out.print("Elements Of Array: ");
        for(String s:arr)
            System.out.print(s+" ");
        System.out.println();
        ArrayList arrayList = new ArrayList(Arrays.asList(arr));
        System.out.print("Elements Of ArrayList: ");
        System.out.println(arrayList);
    }
}
