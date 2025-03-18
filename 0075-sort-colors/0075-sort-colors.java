class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
        int p1=0,p2=n-1,cur=0;
        while(cur<=p2){
            if(nums[cur]==0){
                swap(nums,cur,p1);
                p1++;
                cur++;
            }
            else if(nums[cur]==2){
                swap(nums,cur,p2);
                p2--;
            }
            else{
                cur++;
            }
        }
    }
    private void swap(int[] nums,int i,int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    } 
}