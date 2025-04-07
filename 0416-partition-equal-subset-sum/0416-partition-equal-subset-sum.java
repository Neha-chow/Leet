class Solution {
    public boolean canPartition(int[] nums) {
        int sum =0;
        //HashMap<Integer,Integer>hm = new HashMap<>();
        int n = nums.length;
        for(int i=0;i<n;i++){
            sum += nums[i];
           // hm.add(nums[i],getKeyOf(nums[i],0)+1);
        }
        if(sum%2 != 0 || n==1){
            return false;
        }
        else if(n==2){
           boolean k =(nums[0]==nums[1])?true:false;
           return k;
        }
        
        int k = sum / 2;
        boolean[] dp = new boolean[k + 1];
        dp[0] = true;
        for (int num : nums) {
            for (int j =k; j >= num; j--) {
                dp[j] = dp[j] || dp[j - num];
            }
        }
        return dp[k];
    }
}