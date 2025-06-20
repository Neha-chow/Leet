class Solution {
    public int maxDistance(String s, int k) {
        int north=0,south=0,east=0,west=0;
        int maxdist=0;
        for(int i=0;i<s.length();i++){
            char direction=s.charAt(i);
            if(direction=='N') north++;
            else if(direction=='S') south++;
            else if(direction=='E') east++;
            else  west++;
        
        int o=Math.abs(north-south) + Math.abs(east-west)+2*k;
        
        maxdist=Math.max(maxdist,Math.min(o,i+1)); 
        } 
        return maxdist;
    }
}