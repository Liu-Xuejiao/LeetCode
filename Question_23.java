/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    
    public ListNode mergeKLists(ListNode[] lists) {
        int length = lists.length;
        if(length == 0) return null;
        
        ListNode head = lists[0];
        for(int i=1; i<length; i++) {
        	head = mergeTwoList(head,lists[i]);
        }
        return head;
        
    }
    
  public ListNode mergeTwoList(ListNode A, ListNode B) {
    	if (A==null) return B;
    	if (B==null) return A;
    	
    	if(A.val <= B.val) {
    		A.next = mergeTwoList(A.next, B);
    		return A;
    	}
    	else {
    		B.next = mergeTwoList(A, B.next);
    		return B;
    	}
    }

}