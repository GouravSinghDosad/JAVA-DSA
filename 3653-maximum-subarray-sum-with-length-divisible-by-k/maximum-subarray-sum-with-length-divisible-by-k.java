class Solution {
    public long maxSubarraySum(int[] nums, int k) {
        int n = nums.length;
        
        // 1. Calculate Prefix Sum Array P
        // P[i] stores the sum of nums[0] to nums[i-1]. P[0] = 0.
        // Use long to prevent overflow since nums[i] and N are large.
        long[] P = new long[n + 1];
        for (int i = 0; i < n; i++) {
            P[i + 1] = P[i] + nums[i];
        }

        // 2. Initialize min_prefix_sum array of size k.
        // This stores the minimum prefix sum P[j] found so far for each remainder j % k.
        long[] minPrefixSum = new long[k];
        // Initialize with a value larger than any possible prefix sum
        Arrays.fill(minPrefixSum, Long.MAX_VALUE);
        
        // P[0] = 0 (sum of empty prefix) has remainder 0. 
        // This is the essential base case (starting point for subarrays).
        minPrefixSum[0] = 0; 
        
        // Initialize max_sum to a value that will be updated by any valid subarray sum.
        long maxSum = Long.MIN_VALUE;

        // 3. Iterate through P from index 1 to N (representing the end index j+1 of the subarray)
        for (int i = 1; i <= n; i++) {
            
            // a. Calculate remainder for the current prefix sum P[i]
            int remainder = (int)(i % k);
            
            // b. Calculate Potential Max Sum: P[i] - minPrefixSum[remainder]
            // This difference represents a subarray sum whose length is a multiple of k
            // (since the end index i and start index j have the same remainder mod k).
            if (minPrefixSum[remainder] != Long.MAX_VALUE) {
                long currentSum = P[i] - minPrefixSum[remainder];
                maxSum = Math.max(maxSum, currentSum);
            }
            
            // c. Update the minimum prefix sum for the current remainder group.
            // We use P[i] as a potential new starting point (j) for future subarrays.
            // Note: Since the loop calculates the sum *before* updating the min prefix sum,
            // we implicitly ensure that the resulting subarray length is at least k.
            minPrefixSum[remainder] = Math.min(minPrefixSum[remainder], P[i]);
        }
        
        // Check if maxSum was actually updated. Since k <= n, at least one subarray of length k exists.
        return maxSum;
    }
}