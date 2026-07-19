class Solution {
    public String removeKdigits(String num, int k) {
        int count =0;
        int n = num.length();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<n;i++){
            char curr = num.charAt(i);
            while(sb.length()>0 && curr < sb.charAt(sb.length()-1) && count<k){
                sb.deleteCharAt(sb.length()-1);
                count++;
            }
            sb.append(curr);
        }
        while (count < k && sb.length() > 0) {
            sb.deleteCharAt(sb.length() - 1);
            count++;
        }
        while (sb.length() > 1 && sb.charAt(0) == '0') {
            sb.deleteCharAt(0);
        }
        return sb.length()==0?"0": sb.toString();
    }
}