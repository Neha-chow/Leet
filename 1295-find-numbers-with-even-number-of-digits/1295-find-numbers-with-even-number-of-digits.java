class Solution {
    public int findNumbers(int[] nums) {
        int n = nums.length;
        int count=0;
        int l[] = new int[n];
        for(int i=0;i<n;i++){
            l[i] = (int)Math.log10(nums[i])+1;
            if((l[i]&1)==0) count++; 
        }
        
        return count;
    }
}