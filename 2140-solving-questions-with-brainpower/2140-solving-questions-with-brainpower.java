class Solution {
    public long mostPoints(int[][] q) {
      int n  =q.length;
        long[] res = new long[n];
        res[n-1] = q[n-1][0];
        for(int i = n-2;i>=0;i--){
            if(q[i][1]+i+1>=n){
                res[i] = Math.max(q[i][0],res[i+1]);
            }else{
                res[i] = Math.max(res[i+1],q[i][0]+res[i+1+q[i][1]]);
            }
        }
        return res[0]; 
    }
}