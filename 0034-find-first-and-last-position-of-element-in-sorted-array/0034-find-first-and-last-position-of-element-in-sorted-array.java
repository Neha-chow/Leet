class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n= nums.length;
        int a[]  = new int[2];
        a[0]=-1;
        a[1] = -1;
       int p1=0,p2=n-1; 
       for(int i=0;i<n;i++){
        if(nums[p1]==target){
            a[0]=p1;
        }
        else{
            p1++;
        }
        if(nums[p2]==target){
            a[1]=p2;
        }
        else{
            p2--;
        }
       }
       return a;
    }
}