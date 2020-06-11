/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB ==null) return null;
        if(headA == headB) return headA;

        if(headA.next != null)
            return getIntersectionNode(headA.next, headB);
        if(headB.next != null)
            return getIntersectionNode(headA, headB.next);
        return null;
    }
}
