package collection.queue;

import java.util.*;

// First In First Out (FIFO)
public class QueueDemo {
    public static void main(String[]args) {
        Queue queue = new LinkedList();

        // add() & offer() --> insert value to the queue
        queue.add(3); // if it is added successfully return true, else return exception
        queue.offer(6); // if it is added successfully return true, else return false

        // element() & peek --> return the head of the queue
        queue.element(); // if queue is empty, return exception
        queue.peek(); // if queue os empty, return null

        // remove() & poll() --> return the head element and remove it
        queue.remove(); // if the queue is empty, return exception
        queue.poll(); // if the queue is empty, return null
    }
}
