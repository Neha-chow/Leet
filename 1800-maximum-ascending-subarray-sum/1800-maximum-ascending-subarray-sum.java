class Solution {
    public int maxAscendingSum(int[] nums) {
        int sum=nums[0],maxSum=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]<nums[i]){
                sum += nums[i];
                if(maxSum<sum){
                    maxSum=sum;
                }
            }
            else{
                sum = nums[i];
            }
           
        }
         return maxSum;
    }
}