package merge_two_sorted_lists;


public class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(-1); 
        ListNode p1 = list1, p2 = list2, current = dummy;
        while(p1 != null && p2 != null){
            if(p1.val < p2.val){
                current.next = p1;
                p1 = p1.next;
            }else{
                current.next = p2;
                p2 = p2.next;
            }
            current = current.next; 
        }
        if(p1 != null) current.next = p1;
        if(p2 != null) current.next = p2;
        return dummy.next;
    }
}
