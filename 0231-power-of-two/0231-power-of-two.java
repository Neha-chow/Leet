class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n==0)
        return false;
        else{
        int p = n&(n-1);
        if(p==0 && n>0)
        return true;
        else
        return false;
        }
    }
}