class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int b[] = new int [2*n];
        int j=0;
       for(int i=0;i<n;i++){
        b[j++] = nums[i];
       }
       for(int i=0;i<n;i++){
        b[j++] = nums[i];
       }

       return b; 
       
    }
}