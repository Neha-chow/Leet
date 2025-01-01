class Solution {
    public int maxScore(String s) {
        int max = Integer.MIN_VALUE;
       for(int i=0;i<s.length();i++){
        int p1 =i,p2=s.length()-1,count =0;
            while(p1>=0 && p1<s.length()-1){
                if(s.charAt(p1) == '0') count++;
                p1--;
            }
             while(p2>=i && p2>0){
                if(s.charAt(p2)=='1')
                count++;
                p2--;
            }
            if(count>max){
                max=count;
            }
       }
       return max; 
    }
}