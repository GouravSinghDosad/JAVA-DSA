class Solution {
    public long getDescentPeriods(int[] prices) {
        long total = 0L;
        long curr = 0L; // current descent streak length

        for (int i = 0; i < prices.length; i++) {
            if (i > 0 && prices[i - 1] - prices[i] == 1) {
                curr += 1;
            } else {
                curr = 1; // single day
            }
            total += curr;
        }
        return total;
    }
}