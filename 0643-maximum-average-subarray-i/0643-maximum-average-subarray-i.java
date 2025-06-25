class Solution {
    public double findMaxAverage(int[] nums, int k) {
     int l=0,r=0,sum=0;
     double max=Double.NEGATIVE_INFINITY,avg=0;
     while(r<nums.length){
         sum += nums[r];
        if(r-l+1 == k){
            avg =(double)sum/(r-l+1);
            max = Math.max(avg,max);
            sum -= nums[l];
            l++;
        }
        r++;
       
     } 
     return max;  
    }
}