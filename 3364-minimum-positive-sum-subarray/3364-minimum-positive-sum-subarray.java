class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
         List<List<Integer>> subarray = new ArrayList<>();
        int n = nums.size();

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j <= n; j++) {
                int length = j - i;
                if (length >= l && length <= r) {
                    subarray.add(new ArrayList<>(nums.subList(i, j)));
                }
            }
        }

        int p = Integer.MAX_VALUE;
        for (List<Integer> sub : subarray) {
            int sum = 0; 
            for (int num : sub) {
                sum += num;
            }
            if (sum < p&& sum>0) {
                p = sum;
            }
        }

        return p == Integer.MAX_VALUE ? -1 : p;
    }
    }
