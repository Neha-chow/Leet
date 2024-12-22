class Solution {
    public String mergeAlternately(String word1, String word2) {
        char c1[] = word1.toCharArray();
        char c2[] = word2.toCharArray();
        StringBuilder sb = new StringBuilder();
        if(c1.length<c2.length){
        for(int i=0;i<c1.length;i++){
           sb.append(c1[i]);
            sb.append(c2[i]);
        }
        for(int k = c1.length;k<c2.length;k++)
        sb.append(c2[k]);
        }
        else{
        for(int i=0;i<c2.length;i++){
           sb.append( c1[i]);
           sb.append( c2[i]);
        }
        for(int k = c2.length;k<c1.length;k++)
        sb.append( c1[k]);
        }
        
        return sb.toString();
    }
}