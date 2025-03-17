class Solution {
    public boolean isValid(String s1) {
        Stack<Character>s = new Stack<>();
        boolean b = true;   
        for(char c : s1.toCharArray()){
            if(c=='[' || c == '(' || c == '{')
            s.push(c);
            else{
                if(s.isEmpty()) return false;
                 char p = s.peek();
                if (c == ')' && p == '(') {
                    s.pop(); 
                } else if (c == ']' && p == '[') {
                    s.pop();  
                } else if (c == '}' && p == '{') {
                    s.pop();  
                } else {
                    return false;  
                }
            }
        }
        return s.isEmpty();
    }
}