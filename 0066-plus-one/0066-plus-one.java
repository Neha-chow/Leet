class Solution {
    public int[] plusOne(int[] digits) {
        List<Integer> ls = new ArrayList<>();
        int c=1;
        for(int i=digits.length-1;i>=0;i--){
                int p = digits[i]+c;
                digits[i] = p%10;
                c = (p>=10?1:0);
                if(c==0) return digits;
        }
        int ans[] = new int[digits.length+1];
        if(c>0){
           for(int i=0;i<ans.length;i++) {
            if(i==0){
                ans[0] = c;
            }
            else{
                ans[i] = digits[i-1];
            }
           }
        }
        
        return ans;
    }
}