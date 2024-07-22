class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        int a[] = new int[heights.length];
        String n[] = new String[names.length];
        for(int i=0;i<heights.length;i++){
            a[i] = heights[i];
        }
         int j = 0;
        Arrays.sort(heights);
        for (int i = heights.length - 1; i >= 0; i--) {
            for (int p = 0; p < a.length; p++) {
                if (heights[i] == a[p]) {
                    n[j] = names[p];
                    j++;
                    a[p] = -1; 
                    break;  
                }
            }
        }
        return n;
    }
}