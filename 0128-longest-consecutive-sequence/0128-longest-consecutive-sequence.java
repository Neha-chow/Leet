class Solution {
    public int longestConsecutive(int[] nums) {
        /*Arrays.sort(nums);
        int max = 1,count=1;
        //HashSet<Integer>
        if(nums.length==0) return 0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]) continue;
            if(nums[i]-nums[i-1]  ==1)
            count++;
            else 
            count=1;
            if(max<=count){
                max=count;
            }
        }
        return max;*/
        HashSet<Integer> hs = new HashSet<>();
        for(int num:nums){
            hs.add(num);
        }
        int max =0;
        for(int num:hs){
            if(!hs.contains(num-1)){
                int count=1;
                while(hs.contains(num+count)){
                    count++;
                }
                max = Math.max(count,max);
            }
        }
        return max;
    }
}