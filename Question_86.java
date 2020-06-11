i/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode partition(ListNode head, int x) {
        if(head==null || head.next==null) return head;
                
        ListNode curr_small  = new ListNode(0);
        ListNode curr_big  = new ListNode(0);
        ListNode pre_small = curr_small;
        ListNode pre_big = curr_big;
    
        while(head!=null){
            if(head.val < x){
                curr_small.next = head;
                curr_small = curr_small.next;
            }else{
                curr_big.next = head;
                curr_big = curr_big.next;
            }
            
            head = head.next;
        }
        
        curr_small.next = pre_big.next;
        curr_big.next = null;
        
        return pre_small.next;
    }
}
