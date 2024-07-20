class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int a=x;
        int sum=0;
        while(a>0){
            sum += a%10;
            a=a/10;
        }
        if(x%sum==0)
        return sum;
        else
        return -1;
        
    }
}