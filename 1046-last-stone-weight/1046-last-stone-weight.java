class Solution {
    public int lastStoneWeight(int[] stones) {
        Arrays.sort(stones);
        // for(int i=stones.length-1;i>0;i--){
        //     int p = stones[i]-stones[i-1];
        //     if(p==0){
        //         i--;
        //     }
        //     else{

        //     }
        // }
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<stones.length;i++){
            pq.offer(stones[i]);
        }
        while(pq.size()>1){
            int p = pq.poll();
            int q= pq.poll();
            int r = p-q;
            if(r!=0){
                pq.add(r);
            }
        }
        return pq.size()==0?0:pq.peek();
    }
}