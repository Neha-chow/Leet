class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<nums.length;i++){
            minHeap.add(nums[i]);   
        }
        while(k-->1){
            minHeap.poll();
        }
        return minHeap.peek();
    }
}