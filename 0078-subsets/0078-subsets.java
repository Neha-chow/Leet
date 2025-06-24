class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ls = new ArrayList<>();
        createSubset(nums,0,ans,ls);
        return ans;
    }
    public void createSubset(int[] nums, int index, List<List<Integer>> res, List<Integer> subset) {
        if(index==nums.length){
            res.add(new ArrayList<>(subset));
           return;
        }
        subset.add(nums[index]);
        createSubset(nums, index + 1, res, subset);
        subset.remove(subset.size()-1);
        createSubset(nums, index +1, res, subset);
    }
}