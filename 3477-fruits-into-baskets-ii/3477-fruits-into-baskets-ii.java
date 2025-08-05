class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
       int p1=0,p2=0,count=0;
        int n = fruits.length;
        int m = baskets.length;
        boolean[] u = new boolean[m];
        int c = 0;

        for (int i = 0; i < n; i++) {
            boolean p = false;
            for (int j = 0; j < m; j++) {
                if (!u[j] && fruits[i] <= baskets[j]) {
                    u[j] = true;
                    p = true;
                    break;
                }
            }
            if (!p) {
                c++;
            }
        }
        return c;
    }
}
    