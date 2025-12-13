class Solution {
    public void rotate(int[] nums, int k) {
        
        int n = nums.length;
        k %= n;

        reverse(nums,0, n-1);
        reverse(nums, 0,k-1);
        reverse(nums, k, n-1);
    }

    public void reverse(int[] nums, int start, int last){
        while(start < last){
            int temp = nums[start];
            nums[start] = nums[last];
            nums[last] = temp;
            start++;
            last--;
        }
    }

}