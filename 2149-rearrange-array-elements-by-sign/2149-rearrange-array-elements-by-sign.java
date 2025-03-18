class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int p[] = new int[n/2];
        int q[] = new int[n/2];
        int i=0,j=0;
        for(int num:nums){
            if(num>0){
                p[i++] = num;
            }
            else
               q[j++] = num;
        }
        int r=0,s=0;
        for(int k=0;k<n;k++){
            if(k%2==0){
                nums[k] = p[r++];
            }
            else{
                nums[k] = q[s++];
            }
        }
        return nums;
    }
}