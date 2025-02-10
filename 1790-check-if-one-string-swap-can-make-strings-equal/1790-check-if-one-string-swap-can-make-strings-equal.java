class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        boolean bo = true;
        int count=0;
        char a='a', b='b', c='c', d='d';
        if(s1.length()!=s2.length()){
            return false;
        }
        else{
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)!=s2.charAt(i)){
                count++;
                if(count==1){
                    a=s1.charAt(i);
                    b=s2.charAt(i);
                }
                if(count==2){
                    c=s1.charAt(i);
                    d=s2.charAt(i);
                }
            }
            if(count==3)
            return false;
        }
        }
        return count == 0 || (count == 2 && a == d && b == c);
        
    }
}