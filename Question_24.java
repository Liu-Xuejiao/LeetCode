/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode swapPairs(ListNode head) {
        if(head == null) return null;
        if(head.next == null) return head;
        ListNode curr = head;
        ListNode next = curr.next;
        
        curr.next = swapPairs(next.next);
        next.next = curr;

        return next;
    }
}
