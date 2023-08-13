package exercises.linkedList;

/*
    Given the head of a linked list, rotate the list to the right by k places.
*/

public class RotateList {
    public static void main (String[]args) {
        ListNode ls1 = new ListNode(1);
        ListNode ls2 = new ListNode(2);
        ListNode ls3 = new ListNode(3);
        ListNode ls4 = new ListNode(4);
        ListNode ls5 = new ListNode(5);
        ls1.next=ls2;
        ls2.next=ls3;
        ls2.next=ls3;
        ls3.next=ls4;
        ls4.next=ls5;
        ls5.next=null;

        ls1=rotateRight(ls1,2);
        while(ls1!=null){
            System.out.println(ls1.val);
            ls1=ls1.next;
        }
    }
    public static ListNode rotateRight(ListNode head, int k) {
        if(head==null||head.next==null) return head;
        int count=0;
        ListNode temp=head;
        while(temp!=null) {
            temp=temp.next;
            count++;
        }
        k%=count;
        while(k-->0) {
            ListNode secondLast = head;
            while (secondLast.next.next != null) {
                secondLast = secondLast.next;
            }
            ListNode last = secondLast.next;
            last.next = head;
            head = last;
            secondLast.next = null;
        }
        return head;
    }
}
