class Solution {
    public boolean isHappy(int n) {
        Set<Integer> S = new HashSet<>();
        while(!S.contains(n)){
            S.add(n);
            n=Gn(n);
            if(n==1){
                return true;
            }
        }
        return false;
    }
    int Gn(int n){
        int count=0;
        int sum =0;
        while(n>0){
            count = n%10;
            sum += count*count;
            n=n/10;
        }
        return sum;
    }
}