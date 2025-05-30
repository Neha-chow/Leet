class Solution {
    public int reverse(int x) {
        //Stack<Integer> st = new Stack<>();
        int y=0;
        while(x!=0){
            int p = x%10;
            if (y > Integer.MAX_VALUE / 10 || (y == Integer.MAX_VALUE / 10 && p > 7)) return 0;
            if (y < Integer.MIN_VALUE / 10 || (y == Integer.MIN_VALUE / 10 && p < -8)) return 0;
            y = (y*10)+p;
            x=x/10;
        }
        return y;
    }
}