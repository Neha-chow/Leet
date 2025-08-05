class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ls = new ArrayList<>();
        helper(candidates,target,0,ls,ans);
        return ans;
    }
    public void helper(int candidates[],int target,int index,List<Integer> ls,List<List<Integer>> ans){
        if(index==candidates.length){
            return;
        }
        if(target==0){
            ans.add(new ArrayList<>(ls));
            return;
        }
        if(target>=candidates[index]){
            ls.add(candidates[index]);
            helper(candidates,target-candidates[index],index,ls,ans);
            ls.remove(ls.size()-1);
        }
        
       
        helper(candidates,target,index+1,ls,ans);
    }

}