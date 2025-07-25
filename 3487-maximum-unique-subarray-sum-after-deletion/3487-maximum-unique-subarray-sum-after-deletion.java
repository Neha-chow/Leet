class Solution {
    public int maxSum(int[] nums) {
       HashSet<Integer> hs = new HashSet<>();
       int sum=0;
       for(int i=0;i<nums.length;i++){
        if(nums[i]>0){
            hs.add(nums[i]);
        }
       } 
       if(hs.isEmpty()){
        Arrays.sort(nums);
        return nums[0];
       }
       else{
        for(int i:hs){
                sum += i;
        }
       }
       return sum;
    }
}