class Solution {
    public int minBitFlips(int start, int goal) {
        int p = start^goal;
        int count=0;
        while(p!=0){
            count += p&1;
            p >>=1;
        }
       return count;
    }
}