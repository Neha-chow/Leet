class Solution {
    public int[] constructRectangle(int area) {
        int a[] = new int[2];
        int w= (int)Math.sqrt(area);
        while(area%w!=0){
            w--;
        }
        int l = area/w;
        a[0]=l;
        a[1] =w;
        return a;
    }
}