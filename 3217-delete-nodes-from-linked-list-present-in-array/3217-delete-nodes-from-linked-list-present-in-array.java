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
    public ListNode modifiedList(int[] nums, ListNode head) {
        HashSet<Integer> hs = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            hs.add(nums[i]);
        }
        //for(int i=0;i<hs.size();i++){
            System.out.print(hs);
       // }
        System.out.println();
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;

        while(head != null){
            if(!hs.contains(head.val)){
                tail.next = head;
                tail = tail.next;
            }
            head = head.next;
        }

      
        tail.next = null;

        return dummy.next;
    }
}