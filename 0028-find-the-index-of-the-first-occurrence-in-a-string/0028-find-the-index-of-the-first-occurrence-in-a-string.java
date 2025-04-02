class Solution {
    public int strStr(String haystack, String needle) {
        char h[] = haystack.toCharArray();
        char n[] = needle.toCharArray();
        int p1=0,p2=0;
        while(p1<h.length && p2<n.length){
            if(h[p1]==n[p2]){
                p1++;
                p2++;

           if (p2 == n.length) {
                    return p1 - n.length;
                }
            } else {
              
                p1 = p1 - p2 + 1; 
                p2 = 0; 
            }
        }

       
        return -1;