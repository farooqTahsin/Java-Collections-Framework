package exercises.linkedList;

/*
    Given the head of a linked list, reverse the nodes of the list k at a time, and return the modified list.

    k is a positive integer and is less than or equal to the length of the linked list. If the number of nodes
    is not a multiple of k then left-out nodes, in the end, should remain as it is.

    You may not alter the values in the list's nodes, only nodes themselves may be changed.
*/

import java.util.Stack;

public class ReverseNodeInKGroup {
    public ListNode reverseKGroup(ListNode head, int k) {
        Stack<ListNode>s = new Stack<>();
        ListNode res=new ListNode(0);
        ListNode ans=res;
        ListNode temp=head;
        int i=0;
        while(head!=null) {
            i++;
            s.push(head);
            head=head.next;
            if(i==k) {
                i=0;
                while(!s.isEmpty()) {
                    res.next=s.pop();
                    res=res.next;
                }
                temp=head;
            }
        }
        if(i==k) {
            while(!s.isEmpty()) {
                res.next=s.pop();
                res=res.next;
            }
            res.next=null;
        }
        else if(i!=0)
            res.next=temp;
        return ans.next;
    }
}
