class Solution {
    public int rob(int[] nums) {  
        int n = nums.length;
        int dp[]= new int[n];
       dp[0]= nums[0];
       for(int i=1;i<n;i++){
        int p=nums[i],np=dp[i-1];
        if(i-2>=0){
            p += dp[i-2];
        }
        dp[i] =  Math.max(p,np);
       }
        return dp[n-1];
    }
    // public int helper(int nums[],int index,int[] dp,int n){
    //     int pick = (nums[index]);
    //     if(index+2<n)
    //      pick += helper(nums,index+2,dp,n);
    //      int notpick = 0;
    //      if(index+1<n)
    //      notpick += helper(nums,index+1,dp,n);
          
    //     return dp[index]=Math.max(pick,notpick);
    // }
}