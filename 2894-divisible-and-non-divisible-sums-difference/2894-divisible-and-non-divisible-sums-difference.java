class Solution {
    public int differenceOfSums(int n, int m) {
        int sum1=0,sum2=0,p=1,q=1;
        while(p<=n){
            if(p%m !=0){
                sum1+=p;
            }
            else{
                 sum2 += p;
            }
            p++;
        }
        return sum1-sum2;
    }
}