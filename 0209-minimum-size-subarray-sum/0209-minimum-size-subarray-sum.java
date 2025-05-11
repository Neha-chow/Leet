class Solution {
    public int minSubArrayLen(int target, int[] nums) {
       int l=0,r=0,minlen=Integer.MAX_VALUE,len=0,sum=0;
       while(r<nums.length){
        sum += nums[r];
        while(sum>=target){
            minlen = Math.min(minlen ,(r-l+1));
            sum -= nums[l];
            l++;
        }
        r++;
       } 
       return minlen==Integer.MAX_VALUE?0:minlen;
    }
}