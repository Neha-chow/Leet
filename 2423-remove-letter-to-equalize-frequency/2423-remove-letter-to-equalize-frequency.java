class Solution {
    public boolean isAllEqual(Map<Character,Integer>hm){
        int c=-1;
        for(int val:hm.values()){
            if(c==-1)c=val;
            else if(c!=val)return false;
        }
        return true;
    }
    public boolean equalFrequency(String word) {
    //  int count[] = new int[26];
    //  for(char c:word.toCharArray()){
    //     count[c-'a'] = count[c-'a']+1;
    //  }  
    //  int p1=0;
    //  Arrays.sort(count);
    //  for(int i=0;i<count.length;i++){
    //     if(count[i]>0){
       
    //         p1=i;
    //         break;
    //     }
    //  } 

    //     return count[count.length-1]-count[p1]==1?true:false;
    HashMap<Character,Integer>hm = new HashMap<>();
    for(char c:word.toCharArray()){
        hm.put(c,hm.getOrDefault(c,0)+1);
    }  
     for(char ch:new HashSet<>(hm.keySet())){
        hm.put(ch,hm.get(ch)-1);
        if(hm.get(ch)==0)hm.remove(ch);
        if(isAllEqual(hm))return true;
        hm.put(ch,hm.getOrDefault(ch,0)+1);
     }
     return false;
    }
}