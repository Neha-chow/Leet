class Solution {
    public int hammingWeight(int n) {
        int count=0;
      for(int i=0;i<32;i++){
        int c = n  & (1<<i);
        if(c!=0){
            count++;
        }
      } 
      return count; 
    }
}