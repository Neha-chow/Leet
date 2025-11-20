class Solution {
    public int rob(int[] nums) {
        int sum =0;
        int n = nums.length;
       int dp[]= new int[n];
       Arrays.fill(dp,-1);
        return helper(nums,0,dp,n);
    }
    public int helper(int nums[],int index,int[] dp,int n){
        if(dp[index]!=-1) return dp[index];
        int pick = (nums[index]);
        if(index+2<n)
         pick += helper(nums,index+2,dp,n);
         int notpick = 0;
         if(index+1<n)
         notpick += helper(nums,index+1,dp,n);
         int sum = Math.max(pick,notpick);
        return dp[index]=sum;
    }
}