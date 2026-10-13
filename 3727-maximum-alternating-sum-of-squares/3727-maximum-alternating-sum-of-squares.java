class Solution {
    public long maxAlternatingSum(int[] nums) {
        
        int n = nums.length;

        for(int i=0;i<n;i++){
            if(nums[i]<0){
                nums[i] = nums[i]*(-1);
            }
            //System.out.println(nums[i]);
        }
        Arrays.sort(nums);
        // for(int i=0;i<n;i++){
        //     System.out.println(nums[i]);
        // }
        int p1=0,p2=n-1;
        long ans =0;
        while(p1<p2){
            
            ans += (int)(Math.pow(nums[p2],2) - Math.pow(nums[p1],2));
            p1++;
            p2--;
            System.out.println(ans);
        }
        if(p1==p2)
        ans += Math.pow(nums[p2],2);
        return ans;
    }
}