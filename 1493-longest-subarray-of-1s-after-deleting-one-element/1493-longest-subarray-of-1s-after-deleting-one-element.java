class Solution {
    public int longestSubarray(int[] nums) {
        int maxlen =0,p1=0,len=0;
        int count[] = new int[2];
        count[0] =0;
        count[1]=0;
        for(int p2=0;p2<nums.length;p2++){
            count[nums[p2]]++;
            while(count[0]>1){
                count[nums[p1]]--;
                p1++;
            }
           
            maxlen = Math.max(p2-p1,maxlen);
        }
       
       return maxlen;
    }
}