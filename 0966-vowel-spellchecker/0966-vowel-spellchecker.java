class Solution {
    Set<String> hs;
    Map<String,String> wc;
    Map<String,String> vowel;
    public String[] spellchecker(String[] wordlist, String[] queries) {
        hs = new HashSet<>();
        wc = new HashMap<>();
        vowel = new HashMap<>();
        for(String word:wordlist){
            hs.add(word);

            String wl = word.toLowerCase();
            wc.putIfAbsent(wl,word);

            String wv = devowel(wl);
            vowel.putIfAbsent(wv,word);
        }
        String ans[] = new String[queries.length];
        int t = 0;
        for(String query:queries){
            ans[t++] = solve(query);
        }
        return ans;
    }
    public String solve(String query){
        if(hs.contains(query))
          return query;

        String queryl = query.toLowerCase();
        if(wc.containsKey(queryl))
        return wc.get(queryl);

        String lv = devowel(queryl);
        if(vowel.containsKey(lv))
        return vowel.get(lv);
        return "";

    }
    public String devowel(String word){
        StringBuilder ans = new StringBuilder();
        for(char c: word.toCharArray()){
            ans.append(isVowel(c)?'*':c);
        }
        return ans.toString();
    }
    public boolean isVowel(char c){
       return (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u');
    }
}