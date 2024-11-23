class Solution {
    public char[][] rotateTheBox(char[][] box) {
        int r = box.length;
        int c = box[0].length;
   
        int m =r;
        int n = c;
        for (int i = 0; i < m; i++) {
            int emptyIndex = n - 1; 
            for (int j = n - 1; j >= 0; j--) {
                if (box[i][j] == '#') {
                    
                    box[i][j] = '.';
                    box[i][emptyIndex--] = '#';
                } else if (box[i][j] == '*') {
                    emptyIndex = j - 1;
                }
            }
        }
        char ubox[][] = new char [c][r];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                ubox[j][r - 1 - i] = box[i][j];
            }
        }
        return ubox;
    }
}