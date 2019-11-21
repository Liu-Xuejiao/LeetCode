/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
    	if (head == null || head.next==null) return head;
    	int count = 0;
        ListNode dump = new ListNode(0);
        dump.next = head;
        ListNode slow = dump; 
        ListNode fast = dump; 
        
        while(head!=null){
            count++;
            head = head.next;
        }
        k = (count<=k)?k%count:k;
       while(k>0){
           fast = fast.next;
           k--;
       } 
       
       while(fast.next!=null){
           slow = slow.next;
           fast = fast.next;
       }
        fast.next = dump.next;
        dump.next = slow.next;
        slow.next = null;
        
        
        return dump.next;
      
    }
}