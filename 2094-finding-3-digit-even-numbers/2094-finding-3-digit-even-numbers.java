class Solution {
    public int[] findEvenNumbers(int[] digits) {
        Set<Integer> resultSet = new TreeSet<>();
        int n = digits.length;
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    if (i != j && j != k && i != k) {
                        int d1 = digits[i];
                        int d2 = digits[j];
                        int d3 = digits[k];
                        
                        if (d1 != 0 && d3 % 2 == 0) {
                            int number = d1 * 100 + d2 * 10 + d3;
                            resultSet.add(number);
                        }
                    }
                }
            }
        }
        
        int[] result = new int[resultSet.size()];
        int index = 0;
        for (int num : resultSet) {
            result[index++] = num;
        }
        return result;
    }
}