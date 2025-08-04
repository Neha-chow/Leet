class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        int n = nums.length;
     for(int i=0;i<=((1<<n)-1);i++){
        List<Integer> ls = new ArrayList<>();
        for(int j=0;j<n;j++){
            if((i&(1<<j))!=0){
                ls.add(nums[j]);
            }
        }
        ans.add(new ArrayList<>(ls));
     }
     return ans;
    }
}