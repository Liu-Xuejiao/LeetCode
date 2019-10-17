/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head == null) return false;
        if(head.next == null) return false;
        ListNode index1 = head;
        ListNode index2 = head.next;
        
        while(index1 != index2 ){
            index1 = index1.next;
            if(index2 != null && index2.next != null){
                index2 = index2.next.next;
            }else{
                return false;
            }
        }
        return true;
    }
}
