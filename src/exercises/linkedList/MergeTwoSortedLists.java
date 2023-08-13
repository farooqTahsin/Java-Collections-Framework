package exercises.linkedList;

/*
    You are given the heads of two sorted linked lists list1 and list2.
    Merge the two lists into one sorted list. The list should be made by
    splicing together the nodes of the first two lists.
    Return the head of the merged linked list.
*/

public class MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode res =new ListNode(0);
        ListNode ls = res;
        while (list1 != null && list2 != null) {
            if(list1.val<list2.val) {
                ls.next=list1;
                list1=list1.next;
                ls=ls.next;
            }
            else {
                ls.next=list2;
                list2=list2.next;
                ls=ls.next;
            }
        }
        if(list1!=null)
            ls.next=list1;
        if(list2!=null)
            ls.next=list2;
        return res.next;
    }
}
