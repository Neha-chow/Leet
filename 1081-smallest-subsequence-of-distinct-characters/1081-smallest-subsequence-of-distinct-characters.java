class Solution {
    public String smallestSubsequence(String s) {
        int count[] = new int[26];
        for(int i=0;i<s.length();i++){
            count[s.charAt(i)-'a']=i;
        }
        StringBuffer sb = new StringBuffer();
        boolean visited[] = new boolean[26];
        for(int i=0;i<s.length();i++){
            char curr = s.charAt(i);
            if(visited[curr-'a']){
                continue;
            }
             while(sb.length()>0 && sb.charAt(sb.length()-1)>curr && count[sb.charAt(sb.length()-1)-'a']>i){
                visited[sb.charAt(sb.length()-1)-'a']=false;
                sb.deleteCharAt(sb.length()-1);
            }
            sb.append(curr);
            visited[curr-'a']=true;
        }
        return sb.toString();
    }
}