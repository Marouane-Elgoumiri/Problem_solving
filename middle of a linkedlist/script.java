/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public static void main(String[] args){
        int[] linkedlist = {1,2,3,4,5};
        // System.out.println(middleNode(linkedlist));
    }
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
        }
    public static ListNode middleNode(ListNode head) {
        ListNode slow;ListNode fast;
        fast = head;
        slow = head;
        if(head.next == null){
            return head;
        }
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        } 
        return slow;
    }
}