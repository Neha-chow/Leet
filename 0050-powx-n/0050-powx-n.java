class Solution {
    public double myPow(double x, int N) {
        double k=0;
        long n =N;
        if(n>0)
        k = helper(x,0,n,1);
       else
        k = helper(1/x,0,(n*(-1)),1);
        return k;
    }
    public double helper(double x,long i,long n,double ans){
        if(i>=n){
            return ans;
        }
        return helper(x,i+1,n,ans*x);
    }
}