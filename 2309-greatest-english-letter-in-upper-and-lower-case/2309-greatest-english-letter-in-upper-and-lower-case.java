class Solution {
    public String greatestLetter(String s) {
        HashSet<Character> hs = new HashSet<>();
        for(int i=0;i<s.length();i++){
            hs.add(s.charAt(i));
        }
        for(int i=91;i>=65;i--){
            char c = (char)i;
            char p = (char)(c ^ 32);
           if(hs.contains(p) && hs.contains(c))
            return String.valueOf(c);
        }
        return "";
    }
}