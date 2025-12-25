import java.util.Arrays;

class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {

        Arrays.sort(happiness); // sort ascending
        long sum = 0;
        int decrement = 0;

        // pick the largest happiness values first
        for (int i = happiness.length - 1; i >= 0 && k > 0; i--) {
            int current = happiness[i] - decrement;
            if (current > 0) {
                sum += current;
            }
            decrement++;
            k--;
        }

        return sum;
    }
}
