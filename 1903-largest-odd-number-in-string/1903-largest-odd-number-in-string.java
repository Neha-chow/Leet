class Solution {
    public String largestOddNumber(String num) {
        char c[] = num.toCharArray();
        for(int i=c.length-1;i>=0;i--){
            int p = Character.getNumericValue(c[i]);
            if(p%2!=0){
                return num.substring(0,i+1);
            }
        }
      return "";  
    }
}