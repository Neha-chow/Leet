class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode list3 = new ListNode(0); 
        ListNode l3 = list3;  

        ListNode p1 = list1;
        ListNode p2 = list2;

       
        while (p1 != null && p2 != null) {
            if (p1.val <= p2.val) {
                l3.next = p1;  
                p1 = p1.next;   
            } else {
                l3.next = p2; 
                p2 = p2.next;   
            }
            l3 = l3.next;  
        }
        
        if (p1 != null) {
            l3.next = p1;
        } else {
            l3.next = p2;
        } 
        return list3.next;
    }
}