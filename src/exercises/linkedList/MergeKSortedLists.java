package exercises.linkedList;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class MergeKSortedLists {
    public static void main(String[]args) {

    }
    public ListNode mergeKLists(ListNode[] lists) {
        Set<Integer> set=new HashSet<>();
        for(int i=0;i<lists.length;i++) {
            while(lists[i].next!=null){
                set.add(lists[i].val);
            }
        }
        ListNode res = new ListNode(0);
        ListNode head = res.next;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ListNode newNode=new ListNode((Integer)it.next());
            head.next=newNode;
            head=head.next;
        }
        return res.next;
    }
}
