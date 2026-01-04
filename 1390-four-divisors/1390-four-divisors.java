class Solution {
    public int sumFourDivisors(int[] nums) {
        int answer = 0;

        for (int k : nums) {
            int count = 0;
            int sum = 0;

            for (int j = 1; j * j <= k; j++) {
                if (k % j == 0) {
                    int d1 = j;
                    int d2 = k / j;

                    if (d1 == d2) {
                        count++;
                        sum += d1;
                    } else {
                        count += 2;
                        sum += d1 + d2;
                    }

                    if (count > 4) break;
                }
            }

            if (count == 4) {
                answer += sum;
            }
        }
        return answer;
    }
}
