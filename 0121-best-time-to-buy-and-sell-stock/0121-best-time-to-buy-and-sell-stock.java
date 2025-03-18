class Solution {
    public int maxProfit(int[] p) {
        int cprofit=0,profit=0,min = Integer.MAX_VALUE;
        for(int i=0;i<p.length-1;i++){
            min =Math.min(p[i],min);
            cprofit = p[i+1] - min;
            profit = Math.max(cprofit,profit);
        }
       return  profit;
    }
}