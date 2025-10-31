class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        Arrays.sort(nums);
        int a[] = new int [2];
       int j=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]==nums[i]){
                a[j] = nums[i];
                j++;
            }
        }
        return a;
    }
}