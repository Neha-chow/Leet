class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int count = 0;
        ListNode temp = head;
        ListNode ans = head;  

      
        while(temp != null){
            count++;
            temp = temp.next;
        }

       
        if(count == 1 && n == 1){
            return null;
        }

        
        if(count == n){
            return ans.next;
        }

       
        temp = head;
        for(int i = 1; i < count - n; i++){
            temp = temp.next;
        }

       
        temp.next = temp.next.next;

        return ans;
    }
}
