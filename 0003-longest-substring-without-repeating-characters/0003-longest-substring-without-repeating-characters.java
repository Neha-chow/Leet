class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length(), max =0;
        int left=0;
        if(n==0) return 0;
        HashSet<Character> hs = new HashSet<>();
        for(int right=0;right<n;right++){
            while(hs.contains(s.charAt(right))){
                hs.remove(s.charAt(left));
                left++;
            }
            hs.add(s.charAt(right));
            max = Math.max(max,right-left+1);
        }
        return max;
    }
}