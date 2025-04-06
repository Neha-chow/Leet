class Solution {
    public int lengthOfLastWord(String s) {
        String[] a = s.split(" ");
        int n = a.length;
        String k = a[n-1];
       return k.length();
    }
}