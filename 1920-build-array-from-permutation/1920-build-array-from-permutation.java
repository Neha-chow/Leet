class Solution {
    public int[] buildArray(int[] nums) {
         int l = nums.length;
        int ans[] = new int[l];
        int p=0;
        for(int i=0;i<l;i++){
             p =nums[i];
            ans[i]=nums[p];  
        }
return ans;
        
    }
}