class Solution {
    public int findNumbers(int[] nums) {
        int n = nums.length;
        int count=0;
        int l[] = new int[n];
        for(int i=0;i<n;i++){
            l[i] = (int)Math.log10(nums[i])+1;
           // System.out.print(l[i]+" ");
        }
        for(int i=0;i<n;i++){
            if(l[i]%2==0) count++;
        }
        return count;
    }
}