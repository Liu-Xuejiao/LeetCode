/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
    	
    	if(head == null || head.next == null) return head;
    	
        ListNode dump = new ListNode(0);
        
        dump.next = head;
        ListNode slow = dump;
        ListNode fast = head;
      
        while(fast!=null) {
        	while(fast.next != null && fast.val == fast.next.val) {
        		fast = fast.next;
        	}
        	
        	if(slow.next != fast) {
        		slow.next = fast.next;
        		fast = slow.next;
        	}else {
        		slow = slow.next;
        		fast = fast.next;
        	}
        }
      
        return dump.next;
    }
}
