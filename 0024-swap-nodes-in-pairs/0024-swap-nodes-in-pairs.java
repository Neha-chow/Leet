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
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next==null){
            return head;
        }
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;
        while(head!=null && head.next != null){
            ListNode p1 = head;
            ListNode p2 = head.next;

            prev.next = p2;
            p1.next=p2.next;
            p2.next=p1;

            prev=p1;
            head=p1.next;
        }
        return dummy.next;
    }
}