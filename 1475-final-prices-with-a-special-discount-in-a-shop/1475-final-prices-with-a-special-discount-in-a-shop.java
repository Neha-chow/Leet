class Solution {
    public int[] finalPrices(int[] n) {
        for(int i=0;i<n.length-1;i++){
            for(int j= i+1;j<n.length;j++){
                int p=0;
            if(n[i]>=n[j]){
                 p= n[i] -n[j];
                n[i] = p;
                j = n.length;
            }
            }
        }
        return n;  
    }
}