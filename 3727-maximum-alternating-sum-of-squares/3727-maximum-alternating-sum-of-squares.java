class Solution {
    public long maxAlternatingSum(int[] nums) {
        int n = nums.length;
        for(int i=0;i<n;i++){   
                nums[i] = nums[i]*nums[i];    
        }
        Arrays.sort(nums);
        int p1=0,p2=n-1;
        long ans =0;
        while(p1<p2){ 
            ans += nums[p2] - nums[p1];
            p1++;
            p2--;
        }
        if(p1==p2)
        ans += nums[p2];
        return ans;
    }
}