class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!= t.length()) return false;
        int cs[] = new int[26];
        int ct[] = new int[26];
        for(int i=0;i<s.length();i++){
            cs[s.charAt(i)-'a'] += 1;
        }
        for(int i=0;i<t.length();i++){
            ct[t.charAt(i)-'a'] += 1;
        }
        for(int i=0;i<26;i++){
            if(cs[i]!=ct[i]) return false;
        }
        return true;
    }
}