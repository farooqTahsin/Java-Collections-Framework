package exercises.linkedList;

/*
    Given the head of a linked list and a value x, partition it such that
    all nodes less than x come before nodes greater than or equal to x.

    You should preserve the original relative order of
    the nodes in each of the two partitions.
*/

public class PartitionList {
    public static void main(String[]args) {
        ListNode ls1 = new ListNode(1);
        ListNode ls2 = new ListNode(4);
        ListNode ls3 = new ListNode(3);
        ListNode ls4 = new ListNode(2);
        ListNode ls5 = new ListNode(5);
        ListNode ls6 = new ListNode(2);
        ls1.next=ls2;
        ls2.next=ls3;
        ls2.next=ls3;
        ls3.next=ls4;
        ls4.next=ls5;
        ls5.next=ls6;
        ls6.next=null;

        partition(ls1,3);
        while(ls1!=null){
            System.out.println(ls1.val);
            ls1=ls1.next;
        }
    }
    public static ListNode partition(ListNode head, int x) {
        ListNode lesser = new ListNode(0);
        ListNode res = lesser;
        ListNode greater = new ListNode(0);
        ListNode temp=greater;
        while(head!=null) {
            if(head.val<x){
                lesser.next=head;
                lesser=lesser.next;
            }
            else {
                greater.next=head;
                greater=greater.next;
            }
            head=head.next;
        }
        greater.next=null;
        lesser.next=temp.next;
        return res.next;
    }
}
