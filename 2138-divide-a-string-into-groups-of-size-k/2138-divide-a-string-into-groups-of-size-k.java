class Solution {
    public String[] divideString(String s, int k, char fill) {
        int n = s.length();
        int size = (n + k - 1) / k;
        String ans[] = new String[size];
        int q=0;
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<n;i++){
            sb.append(s.charAt(i));
            if((i+1)%k==0){
                ans[q++] = sb.toString();
                sb = new StringBuilder();
            }
        }
        if(sb.length()>0){
            while(sb.length()!=k){
                sb.append(fill);
            }
             ans[q]= sb.toString();
        }
        return ans;
    }
}