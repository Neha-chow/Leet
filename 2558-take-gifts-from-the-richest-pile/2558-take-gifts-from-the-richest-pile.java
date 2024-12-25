class Solution {
    public long pickGifts(int[] g, int k) {
        int n = g.length;
        while(k-- >0){
            Arrays.sort(g);
            int p = (int)Math.sqrt(g[n-1]);
            g[n-1] =p;
        }
        long sum =0;
        for(int i=0;i<n;i++){
            sum += g[i];
        }
        return sum;
    }
}