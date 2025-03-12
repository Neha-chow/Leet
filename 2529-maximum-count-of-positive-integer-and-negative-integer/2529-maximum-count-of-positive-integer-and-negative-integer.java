class Solution {
    public int maximumCount(int[] nums) {
        int countn=0,countp=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<0){
                countn++;
            }
            else if(nums[i]>0){
                countp++;
            }
        }
        return Math.max(countn,countp);
    }
}