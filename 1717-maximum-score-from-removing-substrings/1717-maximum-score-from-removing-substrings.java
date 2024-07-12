class Solution {
    public int maximumGain(String s, int x, int y) {
          Stack<Character> stack = new Stack<>();
        int points = 0;
        char firstChar = 'a', secondChar = 'b';
        if (y > x) {
            firstChar = 'b';
            secondChar = 'a';
        }
        
        for (char c : s.toCharArray()) {
            if (!stack.isEmpty() && stack.peek() == firstChar && c == secondChar) {
                stack.pop();
                points += Math.max(x, y);
            } else {
                stack.push(c);
            }
        }
        
        Stack<Character> tempStack = new Stack<>();
        while (!stack.isEmpty()) {
            char top = stack.pop();
            if (!tempStack.isEmpty() && tempStack.peek() == firstChar && top == secondChar) {
                tempStack.pop();
                points += Math.min(x, y);
            } else {
                tempStack.push(top);
            }
        }
        
        return points;
    }
}