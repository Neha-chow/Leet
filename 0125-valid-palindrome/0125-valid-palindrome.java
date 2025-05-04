class Solution {
    public boolean isPalindrome(String s) {
       String c = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
       char a[] = c.toCharArray();
       int p1=0,p2=a.length-1;
       while(p1<p2){
        if(a[p1]!=a[p2]) return false;
        else{
            p1++;
            p2--;
        }
       }
       return true;
    }
}