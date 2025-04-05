class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length(),min =0;
        if(n==0){
            return 0;
        }
        HashSet<Character> hs = new HashSet<>();
        int left = 0;

        for (int right = 0; right < n; right++) {
            while (hs.contains(s.charAt(right))) {
                hs.remove(s.charAt(left));
                left++;
            }
            
            hs.add(s.charAt(right));
            min = Math.max(min, right - left + 1);
        }
        return min;
    }
}