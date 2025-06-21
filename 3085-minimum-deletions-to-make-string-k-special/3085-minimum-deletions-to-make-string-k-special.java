class Solution {
    public int minimumDeletions(String word, int k) {
        int[] freq = new int[26];
        for (char c : word.toCharArray()) {
            freq[c - 'a']++;
        }

        int minDeletions = word.length();

        for (int i = 0; i < 26; i++) {
            if (freq[i] == 0) continue;
            int deletions = 0;
            for (int j = 0; j < 26; j++) {
                if (freq[j] == 0) continue;
                if (freq[j] < freq[i]) {
                    deletions += freq[j];
                } else if (freq[j] > freq[i] + k) {
                    deletions += freq[j] - (freq[i] + k);
                }
            }
            minDeletions = Math.min(minDeletions, deletions);
        }

        return minDeletions;
    }
}
