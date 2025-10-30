class Solution {
    public int minNumberOperations(int[] target) {
        int sum = target[0];
        for(int i=1;i<target.length;i++){
            sum += Math.max((target[i]-target[i-1]),0);
        }
        return sum;
    }
}