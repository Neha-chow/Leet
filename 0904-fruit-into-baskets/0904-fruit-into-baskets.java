class Solution {
    public int totalFruit(int[] fruits) {
        int l=0,r=0,max_length=0;
        HashMap<Integer,Integer> hm = new HashMap<>();
        // for(int i=0;i<fruits.length;i++){
        //     hm.put(fruits[i],hm.getOrDefault(fruits[i],0)+1);
        // }
        
            for( r=0;r<fruits.length;r++){
            hm.put(fruits[r],hm.getOrDefault(fruits[r],0)+1);
            if(hm.size()>2){
                hm.put(fruits[l], hm.get(fruits[l]) - 1);
                if(hm.get(fruits[l])==0){
                    hm.remove(fruits[l]);
                }
                    l++;  
            }
            max_length = Math.max(max_length,r-l+1);
        }
        return max_length;
    }
}