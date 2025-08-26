class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        int n = dimensions.length;
        int ans=0;
        float max =0;
        for(int i= 0;i<n;i++){
              int p =  dimensions[i][0]*dimensions[i][0];
               int q =  dimensions[i][1]*dimensions[i][1];
               int k = p+q;
               float sq =(float) Math.sqrt(k);
               int h =dimensions[i][1]*dimensions[i][0];
               if(max<sq || (sq == max && h>ans)){
                 ans = h;
                
               }
             max = Math.max(max,sq);
        }
        return ans;
    }
}