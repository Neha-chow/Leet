class Solution {
    public int minStoneSum(int[] p, int k) {
      PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> b - a);
      int n = p.length;
      for(int i=0;i<n;i++){
        maxHeap.add(p[i]);
      }
        while(k-- >0){
           int v = maxHeap.poll();
            int q = (v+1) /2;
           maxHeap.add(q);
        }
        int sum =0;
         while (!maxHeap.isEmpty()) {
            sum += maxHeap.poll();
        }
        return sum;
    }
}