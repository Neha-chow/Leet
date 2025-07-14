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
    public int getDecimalValue(ListNode head) {
        StringBuilder sb = new StringBuilder();
        while(head!=null){
            sb.append(head.val);
            head = head.next;
        }
        int n =0;
        int p = sb.length()-1;
        for(int i=0;i<sb.length();i++){
            int k =(int) Math.pow(2,(p-i));
            int c = sb.charAt(i)-'0';
            n += c*k;
        }
        return n;
    }
}