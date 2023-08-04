package exercises.stack;

/*
    Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.

    Implement the MinStack class:
        MinStack() initializes the stack object.
        void push(int val) pushes the element val onto the stack.
        void pop() removes the element on the top of the stack.
        int top() gets the top element of the stack.
        int getMin() retrieves the minimum element in the stack.
    You must implement a solution with O(1) time complexity for each function.
*/

import java.util.*;

class MinStack {
    int min=Integer.MIN_VALUE;
    Stack<Integer> s;
    PriorityQueue<Integer> pq;
    public MinStack() {
        s = new Stack<>();
        pq = new PriorityQueue<>();
    }

    public void push(int val) {
        s.push(val);
        pq.offer(val);
        min = Math.min(min,val);
    }

    public void pop() {
        Integer del = s.pop();
        pq.remove(del);
    }

    public int top() {
        return s.peek();
    }

    public int getMin() {
        return pq.peek();
    }
}
