class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
         List<List<Integer>> subarray = new ArrayList<>();
        int n = nums.size();
        int ans=Integer.MAX_VALUE;
        
        for (int i = 0; i < n; i++) {
            int temp = 0;
            for (int j = i; j < n; j++) {
                int length = j - i+1;
                temp += nums.get(j);
                if (length >= l && length <= r&& temp>0) {
                  ans= Math.min(temp,ans);  
                }
            }
        }

        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
    }