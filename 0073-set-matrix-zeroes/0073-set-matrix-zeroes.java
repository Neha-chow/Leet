class Solution {
    public void setZeroes(int[][] nums) {
        int n = nums.length;
        int m = nums[0].length;
        HashSet<Integer> r = new HashSet<>();
        HashSet<Integer> c = new HashSet<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
               if( nums[i][j]==0){
                r.add(i);
                c.add(j);
               }
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(r.contains(i) || c.contains(j)){
                    nums[i][j]=0;
                }
            }
        }
       
    }
}