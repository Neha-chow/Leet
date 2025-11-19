class Solution {
    public int findFinalValue(int[] nums, int original) {
        Arrays.sort(nums);
       while (bsearch(nums, original)) {
            original *= 2;
        }
        return original;
    }
    public boolean bsearch(int[] nums,int original){
        int l=0,r=nums.length-1;
        while(l<=r){
            int mid = (l+r)/2;
            if(nums[mid]<original){
                l= mid+1;
            }
            else if(nums[mid]>original){
                r=mid-1;
            }
            else if(nums[mid]==original){
               return true;//return bsearch(nums,original);
            }
            
        }
        return  false;
    }
}