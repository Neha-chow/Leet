class Solution {
    public void moveZeroes(int[] nums) {
       int p1=0,p2=1;
       for(int i=0;i<nums.length;i++){
        if(nums[i] != 0){
            int t = nums[i];
            nums[i] = nums[p1];
            nums[p1] = t;
            p1++;
        }
       }
    }
}