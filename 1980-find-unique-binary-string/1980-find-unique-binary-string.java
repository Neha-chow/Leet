class Solution {
    public String findDifferentBinaryString(String[] nums) {
        int i=0;
        StringBuilder sb = new StringBuilder();
        for(String s:nums){
         char p = s.charAt(i);
         if(p=='0') sb.append('1');
         else sb.append('0');
         i++;
        }
         
        return sb.toString();
        }
}