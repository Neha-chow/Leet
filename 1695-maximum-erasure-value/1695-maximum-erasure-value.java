class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        int sum =0,maxsum=0;
        HashSet<Integer> hm = new HashSet<>();
        int p1=0,i=0;
       while(i<nums.length){
            if(!hm.contains(nums[i])){
                hm.add(nums[i]);
                sum += nums[i];
                maxsum = Math.max(maxsum,sum);
                i++;
            }else{
                   hm.remove(nums[p1]);
                    sum -= nums[p1];
                    p1++;
                }
                System.out.println(maxsum);
                
            }
           
        
        return maxsum;
    }
}