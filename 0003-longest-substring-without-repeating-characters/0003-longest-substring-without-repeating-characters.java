class Solution {
    public int lengthOfLongestSubstring(String s) {
        char c[] = s.toCharArray();
        int n = c.length;
        HashSet<Character> hs = new HashSet<>();
       int p1=0,p2=0,max=0;
      while(p2<n){
        if(hs.contains(c[p2])){
            hs.remove(c[p1]);
            p1++;
        }
        else{
            hs.add(c[p2]);
            max = Math.max(max,hs.size());
            p2++;
        }
      }
      return max;
    }
}