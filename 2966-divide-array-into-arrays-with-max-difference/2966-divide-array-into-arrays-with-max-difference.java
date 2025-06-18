class Solution {
    public int[][] divideArray(int[] nums, int k) {
        Arrays.sort(nums);
        int n = nums.length;
        List<int[]> ans = new ArrayList<>();
        
        for (int i = 0; i < n; i += 3) {
            if (nums[i + 2] - nums[i] > k) {
                return new int[0][];
            }
            ans.add(new int[]{nums[i], nums[i + 1], nums[i + 2]});
        }
        
        return ans.toArray(new int[ans.size()][]);
    }
}