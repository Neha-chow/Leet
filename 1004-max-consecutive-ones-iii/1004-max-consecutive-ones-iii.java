class Solution {
    public int longestOnes(int[] nums, int k) {
      int maxcount=0,count0=0,count1=0,l=0;
      for(int r =0;r<nums.length;r++){
        if(nums[r]==1) count1++;
        else count0++;
        if(count0>k){
            if(nums[l]==0) count0--;
            else count1--;
            l++;
        }
        maxcount= Math.max(maxcount,r-l+1);
      }
      return maxcount; 
    }
}