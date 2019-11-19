/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null) return null;
        
        ListNode dump = new ListNode(0);
        dump.next = head;
        ListNode slow = dump;
        ListNode fast = dump;
        
        for(int i=0; i<n; i++){
            fast = fast.next;
        }
        
        while(fast.next != null){
            slow = slow.next;
            fast = fast.next;
        }
        
        slow.next = slow.next.next;
        return dump.next;
    }
}
