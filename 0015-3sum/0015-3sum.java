class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> l = new ArrayList<>();
        for(int i=0;i<nums.length-2;i++){
           int  p1=i+1;
            int p2=nums.length-1;
            boolean b = false;
        while(p1<p2){
            int csum = nums[i]+nums[p1] +nums[p2];
            if(csum == 0){
                if(l.contains(Arrays.asList(nums[i], nums[p1], nums[p2]))
                    b = true;
                    else{
                 l.add(Arrays.asList(nums[i], nums[p1], nums[p2]));
                 while (p1 < p2 && nums[p1] == nums[p1 + 1]) p1++; 
                    while (p1 < p2 && nums[p2] == nums[p2 - 1]) p2--; 
                    
                    p1++;
                    p2--;
                    }
              }
            
            else if (csum<0)
            p1++;
            else p2--;
          }
        }
        return l;
    }
}