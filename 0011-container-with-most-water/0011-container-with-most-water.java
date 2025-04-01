class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int p1=0, p2=n-1,max=Integer.MIN_VALUE;
        while(p1<=p2){
            int k = Math.min(height[p1],height[p2]);
            int p = k*(p2-p1);
            if(height[p1]<height[p2]){
                p1++;
            }
            else{
                p2--;
            }
            if(max<p){
                max = p;
            }
        }
        return max;
    }
}