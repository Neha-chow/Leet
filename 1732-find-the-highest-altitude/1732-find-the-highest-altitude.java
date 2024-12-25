class Solution {
    public int largestAltitude(int[] gain) {
        int n = gain.length;
       int a[] = new int[n+1];
       a[0] =0;
       a[1] = gain[0];
       for(int i=1;i<n;i++){
         a[i+1] = a[i]+gain[i];
       } 
       int max = -101;
       for(int i=0;i<n+1;i++){
        if(max<a[i]){
            max =a[i];
        }
       }
       
       return max;
    }
}