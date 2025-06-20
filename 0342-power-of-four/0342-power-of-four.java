class Solution {
    public boolean helper(int n,long num){
        if(n==num) return true;
        if(n<num)return false;
        return helper(n,4*num);
    }
    public boolean isPowerOfFour(int n) {
        if(n==0) return false;
        if(n==1) return true;
        boolean b = helper(n,1);
        return b;
    }
}