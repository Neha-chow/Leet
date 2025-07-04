class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] answer = new int[n];
        Stack<Integer> st = new Stack<>();
        
            for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && temperatures[i] >= temperatures[st.peek()]) {
                st.pop();
            }
            if (!st.isEmpty()) {
                answer[i] = st.peek() - i;
            }
            st.push(i);
        
            }
        return answer;
        
    }
}