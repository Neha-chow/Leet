class Solution {
    public int[] twoSum(int[] n, int target) {
        int p1=0, p2=n.length-1;
        int a[] = new int[2];
        while(p1<p2){
            int sum = n[p1]+n[p2];
            if(sum<target)
            p1++;
            else if(sum>target)
            p2--;
            else{
               a[0] =p1+1;
               a[1] = p2+1;
               //return a;
               break;
            }
        } 
        return a;
    }
}