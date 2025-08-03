class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ls = new ArrayList<>();
        return helper(ls,n,0,0,"");
    }
    public List<String> helper(List<String> ls,int n,int o,int c,String s){
        if(s.length()==2*n){
            ls.add(s);
        }
        if(o<n){
            helper(ls,n,o+1,c,s+"(");
        }
        if(c<o){
             helper(ls,n,o,c+1,s+")");
        }
        return ls;
    }
}