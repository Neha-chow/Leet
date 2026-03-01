class Solution {
    public boolean checkValidString(String s) {

        Stack<Integer> st = new Stack<>();
        Stack<Integer> ast = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == '(') {
                st.push(i);
            } 
            else if (c == '*') {
                ast.push(i);
            } 
            else {
                if (!st.isEmpty()) {
                    st.pop();
                } 
                else if (!ast.isEmpty()) {
                    ast.pop();
                } 
                else {
                    return false;
                }
            }
        }

        while (!st.isEmpty() && !ast.isEmpty()) {
            if (st.peek() < ast.peek()) {
                st.pop();
                ast.pop();
            } 
            else {
                return false;
            }
        }

        return st.isEmpty();
    }
}