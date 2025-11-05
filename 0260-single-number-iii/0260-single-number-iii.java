class Solution {
    public int[] singleNumber(int[] nums) {
     HashMap<Integer,Integer> hm = new HashMap<>();
     for(int i=0;i<nums.length;i++){
        hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
     } 
     
     int ans[] = new int[2];
       int index=0;
       for(Map.Entry<Integer,Integer>entry:hm.entrySet()){
        if(entry.getValue() == 1){
            ans[index++] = entry.getKey();
        }
       }
       return ans;
    }
}