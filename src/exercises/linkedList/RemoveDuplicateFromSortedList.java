package exercises.linkedList;

/*
    Given the head of a sorted linked list, delete all nodes that have duplicate numbers,
    leaving only distinct numbers from the original list. Return the linked list sorted as well.
*/

public class RemoveDuplicateFromSortedList {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode res = new ListNode(0);
        res.next = head;
        ListNode prev = res;
        int i = 200;
        while(head!=null && head.next!=null) {
            if(head.val==head.next.val) {
                i=head.val;
                prev.next = head.next.next;
                head=head.next.next;
            }
            else if ( head.val == i ) {
                prev.next=head.next;
                head=head.next;
            }
            else {
                prev=prev.next;
                head=head.next;
            }
        }
        if(res.next==null)return null;
        if(head!=null && i == head.val)
            prev.next=null;
        return res.next;
    }
}
