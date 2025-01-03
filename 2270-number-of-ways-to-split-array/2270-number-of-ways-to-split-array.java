class Solution {
    public int waysToSplitArray(int[] nums) {
        long sum =0;
        for(int i=0;i<nums.length;i++){
            sum += nums[i];
        }
        int count =0;
        long csum =0;
        for(int i=0;i<nums.length-1;i++){
            csum += nums[i];
            long k = sum - csum; 
            if(csum >= k){
            count ++;
            }
        }
        return count;
    }
}