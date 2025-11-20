class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        ArrayList<Integer> ls = new ArrayList<>();
        ArrayList<Integer> ls2 = new ArrayList<>();
        for(int i=0;i<n;i++){
            if(i!=0) ls2.add(nums[i]);
            if(i!=n-1)ls.add(nums[i]);
        }
         if(n==1) return nums[0];
        int p1 = solve(ls);
        int p2 = solve(ls2);

        return  Math.max(p1,p2);
    }
    public int solve(ArrayList<Integer> ls){
        int n = ls.size();
        int dp[] = new int[n];
       
        if(n==1) return ls.get(0);
         dp[0] = ls.get(0);
        for(int i=1;i<n;i++){
            int p=ls.get(i);
            if(i-2>=0){
                p += dp[i-2];
            }
            int np = dp[i-1];
            dp[i] = Math.max(p,np);
        }
        return dp[n-1];
    }

}