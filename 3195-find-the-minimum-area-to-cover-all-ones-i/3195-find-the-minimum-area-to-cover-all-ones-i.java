class Solution {
    public int minimumArea(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
       int minr =n;
       int minc=m;
       int maxr=-1;
       int maxc=-1;
       for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            if(grid[i][j]==1){
                minr = Math.min(i,minr);
                maxr = Math.max(i,maxr);
                minc = Math.min(j,minc);
                maxc = Math.max(j,maxc);
            }
        }
       }
       if(maxr==-1) return 0;
      
       int k =  (maxr-minr+1)*(maxc-minc+1);
       return k;
    }
}