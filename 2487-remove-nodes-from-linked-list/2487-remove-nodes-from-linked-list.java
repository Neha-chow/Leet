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
    public ListNode removeNodes(ListNode head) {
    
        head = reverse(head);
        
        
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        int maxSoFar = Integer.MIN_VALUE;
        
        while (head != null) {
            if (head.val >= maxSoFar) {
                maxSoFar = head.val;
                current.next = new ListNode(head.val);
                current = current.next;
            }
            head = head.next;
        }
        
        
        return reverse(dummy.next);
    }
    
    private ListNode reverse(ListNode head) {
        ListNode prev = null, next = null, curr = head;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}
