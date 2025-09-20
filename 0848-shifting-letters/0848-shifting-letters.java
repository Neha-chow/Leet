class Solution {
    public String shiftingLetters(String s, int[] shifts) {
        int n = s.length();
        int prefix[] = new int[n];

        prefix[n - 1] = shifts[n - 1]%26;
        for (int i = n - 2; i >= 0; i--) {
            prefix[i] = prefix[i + 1] + (shifts[i]%26); 
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            int k = s.charAt(i) - 'a';
            int newChar = (k + prefix[i]) % 26;
            sb.append((char)('a' + newChar));
        }

        return sb.toString();
    }
}

