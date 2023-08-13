package exercises.linkedList;

/*
    Given head, the head of a linked list, determine if the linked list has a cycle in it.
    There is a cycle in a linked list if there is some node in the list that can be reached
    again by continuously following the next pointer. Internally, pos is used to denote the index
    of the node that tail's next pointer is connected to. Note that pos is not passed as a parameter.
    Return true if there is a cycle in the linked list. Otherwise, return false.
*/

public class LinkedListCycle {

    // Using LinkedList

//    public static boolean hasCycle(ListNode head) {
//        LinkedList<ListNode>ls=new LinkedList<>();
//        while(head!=null) {
//            ls.add(head);
//            head=head.next;
//            if(ls.contains(head)) return true;
//        }
//        return false;
//    }


    // Using Two Pointers
    public static boolean hasCycle(ListNode head) {
        ListNode slow=head, fast=head;
        while(fast!=null && fast.next!=null) {
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast)return true;
        }
        return false;
    }
}
