class Solution {
    public String removeStars(String s) {
        Stack<Character> st = new Stack<>();
        for(char ch: s.toCharArray()){
            if(ch=='*'){
              if(!st.isEmpty()){
                  st.pop();
              }  
            }
            else{
                st.push(ch);
            }  
        }
        StringBuilder sb = new StringBuilder();
        while (!st.isEmpty()) {
            sb.append(st.pop());
        }
        sb.reverse();
        return sb.toString();
    }
}