class Solution {
    public int[] mostCompetitive(int[] nums, int k) {
        ArrayList<Integer> sb = new ArrayList<>(); 
        int n = nums.length;
        for(int i=0;i<nums.length;i++){
            while(sb.size()>0 &&nums[i]<sb.get(sb.size()-1) && (sb.size()+(n-i))>k){
                sb.remove(sb.size()-1);
            }
            sb.add(nums[i]);
        }
        int ans[] = new int[k];
        for(int i=0;i<k;i++){
            ans[i]=sb.get(i);
        }
        return ans;
    }
}