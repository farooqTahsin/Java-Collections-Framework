package collection.list.vector;

import java.util.Stack;

// Last In First Out (LIFO)
public class StackDemo {
    public static void main(String[]args) {

        // Declare Stack
//        Stack st = new Stack();
//        Stack <Integer> st = new Stack<Integer>();
        Stack <String> st = new Stack<String>();

        // push elements to the stack
        st.push("Jad");
        st.push("Farooq");
        st.push("Leen");
        st.push("Majd");
        st.push("Tarek");

        // print stack
        System.out.println(st); // [Jad, Farooq, Leen, Majd, Tarek]

        // print the top of the stack
        System.out.println(st.peek()); // Tarek
        System.out.println("After peek -> "+st); // After peek -> [Jad, Farooq, Leen, Majd, Tarek]

        // print the top of the stack and remove it from the stack
        System.out.println(st.pop()); // Tarek
        System.out.println("After pop -> " + st); // After pop -> [Jad, Farooq, Leen, Majd]

        // contains() --> return true if the stack contains the value, else return false
        System.out.println(st.contains("Farooq")); // true
        System.out.println(st.contains("Tarek")); // false

        // search() --> return the position of the element from the top of the stack start with 1, else return -1
        System.out.println(st.search("Farooq")); // 3
        System.out.println(st.search("Tarek")); // -1

        // empty() --> return true if the stack is empty, else return false
        System.out.println(st.empty()); // false


        // get(position) --> return the element in this position from the bottom of the stack start with 0
        System.out.println(st.get(0)); // Jad
        System.out.println(st.get(1)); // Farooq

        // set(position, value) --> replaces the element at the specified position in this stack with the specified value, and print the previous value
        System.out.println(st.set(1, "Farooq Tahsin")); // Farooq
        System.out.println(st); // [Jad, Farooq Tahsin, Leen, Majd]

        // size()
        System.out.println(st.size()); // 4

    }
}
