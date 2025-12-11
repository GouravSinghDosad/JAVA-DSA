class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        // 1. Reduce k to be within the bounds of the array length
        k = k % n;
        
        if (k == 0) return;

        // 2. Reverse the entire array
        reverse(nums, 0, n - 1); // Example: [1,2,3,4,5,6,7] -> [7,6,5,4,3,2,1]

        // 3. Reverse the first k elements
        reverse(nums, 0, k - 1); // Example (k=3): [7,6,5 | 4,3,2,1] -> [5,6,7 | 4,3,2,1]

        // 4. Reverse the remaining N-k elements
        reverse(nums, k, n - 1); // Example: [5,6,7 | 1,2,3,4]
    }

    // Helper method to reverse a portion of the array
    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}