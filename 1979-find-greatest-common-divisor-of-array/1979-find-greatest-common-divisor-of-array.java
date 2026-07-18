class Solution {
    public int findGCD(int[] nums) {
        int small = Integer.MAX_VALUE, large = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(small>nums[i]){
                small = nums[i];
            }
            if(large<nums[i]){
                large = nums[i];
            }
        }
            int p = helper(small,large);
            return p;
        
    }
        private int helper(int a, int b){
            if(a%b == 0){
                return b;
            }
            else{
                a= a%b;
            }
           return helper(b,a);
        }
    
}