class Solution {
    public int maxSubArray(int[] nums) {
        int sum=nums[0],csum=0;
        for(int i=0;i<nums.length;i++){
            if(csum<0){
                csum =0;
            }
            csum += nums[i];
            sum = Math.max(csum,sum);
        }
        return sum;
    }
}