class Solution {
    public int maximumCount(int[] nums) {
        int countn=binarySearch(nums,0);
        int countp=nums.length - binarySearch(nums,1);
        
        return Math.max(countn,countp);
    }
    private int binarySearch(int nums[],int target){
        int p1=0,p2=nums.length-1,result=nums.length;
        while(p1<=p2){
            int mid = p1+((p2-p1)/2);
            if(nums[mid]<target)
            p1 = mid+1;
            else {
                result = mid;
                p2 = mid-1;
            }
        }
        return result;
    }
}