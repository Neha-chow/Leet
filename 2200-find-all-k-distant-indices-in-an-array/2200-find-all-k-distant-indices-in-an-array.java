class Solution {
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        //List<Integer> ls = new ArrayList<>();
        HashSet<Integer> hs = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                int p=Math.abs(i-j);
                if(p<=k && nums[j]==key){
                    hs.add(i);
                }
            }
        }
         List<Integer> ls = new ArrayList<>(hs);
         Collections.sort(ls);
         return ls;
    }
}