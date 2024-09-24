class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
        int a[][] = new int [m][n];
        int b[][] = new int [m][n];
        int k=0;
        int p = m*n;
        if(p==original.length){
            for(int i=0;i<m;i++){
                for(int j=0;j<n;j++){
                    a[i][j] = original[k];
                    k++;
                }
            }
            return a;
        }
        return new int[0][0];
    }
}