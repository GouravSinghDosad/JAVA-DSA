class Solution {
    public int maximumProduct(int[] nums) {
        
        
        int n = nums.length;

        Arrays.sort(nums);

        int prod = nums[n-1] * nums[n-2] * nums[n-3];
        int prod2 = nums[0] * nums[1] * nums[n-1];

        int maxi = Math.max(prod,prod2);

        return maxi;
    }
}