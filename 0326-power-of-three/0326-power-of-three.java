class Solution {
    public boolean three(int n,long num){
        if(n==num) return true;
        if(n<num) return false;
        return three(n,3*num);
    }
    public boolean isPowerOfThree(int n) {
        if(n==0) return false;
       boolean b = three(n,1);
       return b;
    }
}