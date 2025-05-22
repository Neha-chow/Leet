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
    public ListNode reverseList(ListNode head) {
        Stack<ListNode> st = new Stack<>();
        while(head!=null){
            st.push(head);
            head= head.next;
        }
        ListNode dummy=new ListNode(0);
        ListNode current=dummy;
        while(!st.isEmpty()){
            ListNode ne = st.pop();
            ne.next=null;
            current.next = ne;
            current = current.next;
        }
        return dummy.next;
    }
}