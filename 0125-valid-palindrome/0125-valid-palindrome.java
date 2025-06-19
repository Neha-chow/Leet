// class Solution {
//     public boolean isPalindrome(String s) {
//        String c = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
//        char a[] = c.toCharArray();
//        int p1=0,p2=a.length-1;
//        while(p1<p2){
//         if(a[p1]!=a[p2]) return false;
//         else{
//             p1++;
//             p2--;
//         }
//        }
//        return true;
//     }
// }
class Solution {
     public boolean isPalindrome(String s) {
        String c = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int l=0, r = c.length()-1;
        return functionss(l,r,c);
     }
    public boolean functionss(int l,int r,String c){
            if(l>=r)
                return true;
            if(c.charAt(l)!=c.charAt(r)) return false;
            return functionss(l+1,r-1,c);
    }
}