class Solution {
    public boolean canPlaceFlowers(int[] f, int n) {
        int k = f.length;
        
        for(int i=0;i<f.length;i++){
            
            if(f[i]==0 &&(i==0 || f[i-1]==0) && (i == k-1 || f[i+1]==0)){
            n--;
            f[i] =1;
            }
        }
        if(n<=0)
        return true;
        else
        return false;
    }
}