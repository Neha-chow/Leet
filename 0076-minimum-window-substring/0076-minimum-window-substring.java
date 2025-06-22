class Solution {
    public String minWindow(String s, String t) {
        int p1=0,p2=0,index=-1,min=Integer.MAX_VALUE,count=0;
        HashMap<Character,Integer> hm = new HashMap<>();
           for (char ch : t.toCharArray()) {
            hm.put(ch, hm.getOrDefault(ch, 0) + 1);
        }
        while(p2<s.length()){
            char ch = s.charAt(p2);
            if(hm.containsKey(ch)){
                hm.put(ch,hm.get(ch)-1);
                if(hm.get(ch)>=0){
                    count++;
                }
            }
            while(count==t.length()){
                if(p2-p1+1<min){
                    min =p2-p1+1;
                    index=p1;
                }
                char lch = s.charAt(p1);
                if(hm.containsKey(lch)){
                    hm.put(lch,hm.get(lch)+1);
                    if(hm.get(lch)>0){
                        count--;
                    }
                }
                p1++;
            }
            p2++;
        }
        return min==Integer.MAX_VALUE?"":s.substring(index,index+min);
    }
}