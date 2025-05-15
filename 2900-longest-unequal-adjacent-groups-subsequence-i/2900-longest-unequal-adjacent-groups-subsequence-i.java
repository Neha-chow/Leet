class Solution {
    public List<String> getLongestSubsequence(String[] words, int[] groups) {
        List<String> ls = new ArrayList<>();
        int k=-1;
        for(int i=0;i<words.length;i++){
            if(groups[i] != k){
                ls.add(words[i]);
                k = groups[i];
            }
        }
        return ls;
    }
}