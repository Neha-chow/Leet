class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ls = new ArrayList<>();
        helper (candidates,target,0,ls,ans);
        return ans;
    }
    public void helper(int candidates[],int target,int index,List<Integer> ls ,List<List<Integer>> ans){
        if(target==0){
            ans.add(new ArrayList<>(ls));
            return;
        }
        for(int i= index;i<candidates.length;i++){
            if(i>index && candidates[i]==candidates[i-1]) continue;
            if(candidates[i]>target) break;
            ls.add(candidates[i]);
            helper(candidates,target-candidates[i],i+1,ls,ans);
            ls.remove(ls.size()-1);
        }  
    }
}