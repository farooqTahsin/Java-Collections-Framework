package exercises.linkedList;

/*
    Given the head of a singly linked list and two integers left and right where left <= right,
    reverse the nodes of the list from position left to position right, and return the reversed list.
*/

public class ReverseLinkedList {
    public ListNode reverseBetween(ListNode head, int l, int r) {
        ListNode res = new ListNode(0);
        res.next = head;
        ListNode leftMinusOne = res;
        for(int i = 0; i < l - 1; i++)
            leftMinusOne = leftMinusOne.next;
        ListNode leftMinusOnePlusOne = leftMinusOne.next;
        for(int i = 0; i < r - l; i++){
            ListNode leftMinusOnePlusTwo = leftMinusOnePlusOne.next;
            leftMinusOnePlusOne.next = leftMinusOnePlusTwo.next;
            leftMinusOnePlusTwo.next = leftMinusOne.next;
            leftMinusOne.next = leftMinusOnePlusTwo;
        }
        return res.next;
    }
}
