package exercises.linkedList;

/*
    Given the head of a linked list, remove the nth node from the end of the list and return its head.
*/

public class RemoveNthNodeFromEndOfList {
     public static void main(String[]args) {
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

         removeNthFromEnd(ls1,2);
         while(ls1!=null){
             System.out.println(ls1.val);
             ls1=ls1.next;
         }
     }
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        int i=0;
        ListNode res = new ListNode(0);
        res.next=head;
        while(head!=null) {
            i++;
            head=head.next;
        }
        if(n==1&&i==1) return new ListNode();
        int p =i-n;
        head=res.next;
        i=0;
        if(p==0) {
            return head.next;
        } else {
            while(head!=null) {
                i++;
                if(i==p) {
                    head.next=head.next.next;
                    break;
                }
                head=head.next;
            }
        }
        return  res.next;
    }
}
