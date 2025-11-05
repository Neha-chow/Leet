class Solution {
    public int[] processQueries(int[] queries, int m) {
        int n = queries.length;
        int p[] = new int[m];
        int j=0;
        for(int i=1;i<=m;i++){
            p[i-1] = i;
        }
        
        int ans[] = new int[n];
        while(j <n){
            int index=0;
            for(int i=0;i<m;i++){
                if(queries[j] ==p[i]){
                    ans[j] =i;
                    index=i;
                }
            }
            while(index>0){
                int temp = p[index];
                p[index] = p[index-1];
                p[index-1] = temp;
                index--;
            }
            j++;
        }
        return ans;
    }
}