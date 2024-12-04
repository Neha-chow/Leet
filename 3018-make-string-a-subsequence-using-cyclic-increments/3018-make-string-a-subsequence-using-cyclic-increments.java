class Solution {
    public boolean canMakeSubsequence(String str1, String str2) {
        int i=0,j=0;
        int l = str1.length();
        int m = str2.length();
        Set<String> s1 = new HashSet<>();
        Set<String> s2 = new HashSet<>();
        while(i<l && j<m){
            if(str1.charAt(i)==str2.charAt(j)){
                i++;
                j++;
            }
            else{
                char character= ' ';
               int asciiValue = (int) str1.charAt(i);
               if(asciiValue!=122){
               int ascii = asciiValue+1;
                character = (char) ascii;
               }
               else{
               int ascii = asciiValue-25;
                character = (char) ascii;
               }
                if(character== str2.charAt(j)){
                    i++;
                    j++;
                }
                else{
                    i++;
                }
            }
        }
        if(j==m){
            return true;
        }
        else
        return false;
       
    }
}