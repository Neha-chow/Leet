class Solution {
    public int[] sortArray(int[] nums) {
      for(int i=1;i<nums.length;i++){
            int j=i-1;
            int k =nums[i];
            while(j>=0 && nums[j]>k){
              nums[j+1] = nums[j];
              j--;
            }
            nums[j+1] =k;
       } 
       return nums;  
    }
}