class Solution {
    public int chalkReplacer(int[] chalk, int k) {
        int count=0;
        while(k>=0){
          for(int i=0;i<chalk.length;i++){
            if(chalk[i]<=k){
              k -= chalk[i];
              count++;
            }
            else 
            return i;
          }
        }
        return count%chalk.length;
    }
}