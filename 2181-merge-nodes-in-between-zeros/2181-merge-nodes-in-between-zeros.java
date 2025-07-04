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
    public ListNode mergeNodes(ListNode head) {
        ListNode dummy =new ListNode(0);
        ListNode p = dummy;
        head = head.next;
        int sum =0;
        while(head!=null){
            if(head.val!=0){
                sum += head.val;
            }else{
                ListNode k = new ListNode(sum);
                p.next = k;
                p = p.next;
                sum =0;
            }
            head = head.next;
        }
        return dummy.next;
    }
}