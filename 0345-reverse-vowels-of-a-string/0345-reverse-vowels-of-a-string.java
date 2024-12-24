class Solution {
    public String reverseVowels(String s) {
       int p1=0,p2=s.length()-1;
       char c[] = s.toCharArray();
       String v = "aeiouAEIOU";
       while(p1<p2){
        while(p1 < p2 && v.indexOf(c[p1]) == -1){
            p1++;
        } 
        while(p1 < p2 && v.indexOf(c[p2]) == -1){
            p2--;
        } 
        char temp = c[p1];
        c[p1] = c[p2];
        c[p2] = temp;
        p1++;
        p2--;
       }
       String k = new String(c);
       return k;
    }
}