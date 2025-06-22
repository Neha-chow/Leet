class Solution {
    public int[] plusOne(int[] digits) {
        List<Integer> ls = new ArrayList<>();
        int c=1;
        for(int i=digits.length-1;i>=0;i--){
                int p = digits[i]+c;
                ls.add(p%10);
                c = (p>=10?1:0);
                
        }
        if(c>0)
        ls.add(c);
       Collections.reverse(ls);
        int ans[] = new int[ls.size()];
        for(int i=0;i<ls.size();i++){
            ans[i] = ls.get(i);
        }
        return ans;
    }
}