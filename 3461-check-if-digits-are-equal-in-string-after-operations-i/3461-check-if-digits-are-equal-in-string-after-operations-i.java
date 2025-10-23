class Solution {
    public boolean hasSameDigits(String s) {
        int a[] = new int[s.length()];
        for(int i=0;i<s.length();i++){
            a[i] = Character.getNumericValue(s.charAt(i));
        }
        int k = s.length();
        while(k!=2){
            int j =0;
            for(int i=1;i<s.length();i++){
               int p = (a[i-1]+a[i]) %10;
                 a[j] =p;
            System.out.println(a[j]);
                j++;
            }
             k--;
            System.out.print(k);
        }
        if(a[0]==a[1])return true;else return false;
       // return false;
    }
    
}