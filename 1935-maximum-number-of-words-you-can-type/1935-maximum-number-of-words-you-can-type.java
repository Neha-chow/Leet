class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        int count=0;
        char c[] = brokenLetters.toCharArray();
        String s[] = text.split(" ");
        boolean b[] =new boolean[s.length];
        Arrays.fill(b,true);
        int j=0;
        while(j<c.length){
        for(int i=0;i<s.length;i++){
            String k = s[i];
            if(k.contains(Character.toString(c[j])) && b[i]==true){
                count++;
                b[i] = false;
            }
        }
        j++;
        }
        return s.length-count;
    }
}