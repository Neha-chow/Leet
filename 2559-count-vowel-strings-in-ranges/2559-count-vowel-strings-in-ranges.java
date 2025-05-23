class Solution {
    public int[] vowelStrings(String[] words, int[][] queries) {
        int n = words.length;
        int vowelCount[] = new int[n];
       int index=0;
        for(String k :words){
            int len = k.length();
            if((k.charAt(0) == 'a' || k.charAt(0) == 'e' || k.charAt(0) == 'i' || k.charAt(0) == 'o' || k.charAt(0) == 'u') &&
    (k.charAt(len - 1) == 'a' || k.charAt(len - 1) == 'e' || k.charAt(len - 1) == 'i' || k.charAt(len - 1) == 'o' || k.charAt(len - 1) == 'u')) {
    vowelCount[index] = 1;
            }
            index++;
        }
        int prefixSum[] = new int[n];
        prefixSum[0] = vowelCount[0];
        for(int i=1;i<n;i++){
            prefixSum[i] = prefixSum[i-1]+vowelCount[i];
        }
        int res[] = new int[queries.length];
        for(int i=0;i<queries.length;i++){   
                int l=queries[i][0];
                int r = queries[i][1];
                if(l!=0){
                    res[i] = prefixSum[r]-prefixSum[l-1];
                }
                else
                res[i] = prefixSum[r];    
        }
        return res;
   }
}