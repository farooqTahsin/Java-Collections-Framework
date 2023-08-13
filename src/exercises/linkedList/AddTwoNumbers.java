package exercises.linkedList;

/*
    You are given two non-empty linked lists representing two non-negative integers.
    The digits are stored in reverse order, and each of their nodes contains a single digit.
    Add the two numbers and return the sum as a linked list.
    You may assume the two numbers do not contain any leading zero, except the number 0 itself.
*/

public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode res=new ListNode(0);
        ListNode curr = res;
        int carry=0;
        while(l1!=null&&l2!=null) {
            carry=l1.val+l2.val+ carry/10;
            if (carry > 9) {
                curr.next = new ListNode(carry%10);
                curr=curr.next;
            }
            else {
                curr.next = new ListNode(carry);
                curr=curr.next;
                carry=0;
            }
            l1=l1.next;
            l2=l2.next;
        }
        while(l1 != null ){
            carry = l1.val + carry/10;
            if(carry > 9){
                curr.next = new ListNode(carry%10);
            }else{
                curr.next = new ListNode(carry);
                carry = 0;
            }
            l1 = l1.next;
            curr = curr.next;
        }
        while(l2 != null ){
            carry = l2.val + carry/10;
            if(carry > 9){
                curr.next = new ListNode(carry%10);
            }else{
                curr.next = new ListNode(carry);
                carry = 0;
            }
            l2 = l2.next;
            curr = curr.next;
        }
        if(carry>0){
            curr.next = new ListNode(carry/10);
            curr = curr.next;
        }
        return res.next;
    }
}
