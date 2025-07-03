class Solution {
    public char kthCharacter(int k) {
         StringBuilder currentString = new StringBuilder("a");
        System.out.println(currentString); // Print the initial string
        int n = 1; // Initial length of the string

        while (n < k) {
            StringBuilder nextString = new StringBuilder();
            for (int i = 0; i < currentString.length(); i++) {
                char ch = currentString.charAt(i);
                nextString.append(ch);
                if (ch < 'z') {
                    nextString.append((char) (ch + 1));
                }
            }
            currentString = nextString;
            n = currentString.length();
            System.out.println(currentString); // Print the generated string at each step
        }

        return currentString.charAt(k - 1);
    }
}