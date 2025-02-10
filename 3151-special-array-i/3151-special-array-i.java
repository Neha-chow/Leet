class Solution {
    public boolean isArraySpecial(int[] nums) {
        int n = nums.length;
        if(n==1){
            return true;
        }
        boolean b = true;
        for(int i=1;i<n;i++){
            if(nums[i-1]%2==0 && nums[i]%2 ==0){
                b=false;
            }
            if(nums[i-1]%2!=0 && nums[i]%2 !=0){
                b=false;
            }
        }
        return b;
    }
}