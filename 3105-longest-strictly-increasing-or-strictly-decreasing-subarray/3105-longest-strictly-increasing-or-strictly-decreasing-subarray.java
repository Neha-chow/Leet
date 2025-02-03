class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int maxcount=1,acount=1,gcount=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]<nums[i]){
               acount++;
               gcount=1;
               
            }
            else if(nums[i-1]>nums[i]){
               gcount++;
               acount =1;
               
            }
           else {
               gcount =1;
               acount =1;
               
            }
         maxcount = Math.max(maxcount,Math.max(acount,gcount));    
        }
        
        return maxcount;
    }
}