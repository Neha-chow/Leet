class Solution {
    public List<Integer> replaceNonCoprimes(int[] nums) {
        List<Integer> st = new ArrayList<>();
        for(int n:nums){
            while(!st.isEmpty()){
                int top = st.get(st.size()-1);
                int g = gcd(top,n);
                if(g==1){
                    break;
                }
                st.remove(st.size()-1);
                n=(top/g)*n;
            }
            st.add(n);
        }
        return st;
    }
    public int gcd(int a,int b){
        if(b==0) return a;
        return gcd(b,a%b);
    }
}