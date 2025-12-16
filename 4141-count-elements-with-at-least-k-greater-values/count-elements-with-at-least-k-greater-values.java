class Solution {
    public int countElements(int[] nums, int k) {

        if (k == 0) return nums.length;

        Arrays.sort(nums);
        int n = nums.length;
        int count1 = 0;

        for (int i = 0; i < n; ) {

            int j = i;
            // move j to last occurrence of nums[i]
            while (j + 1 < n && nums[j + 1] == nums[i]) {
                j++;
            }

            int greater = n - 1 - j;
            if (greater >= k) {
                count1 += (j - i + 1); // count all duplicates together
            }

            i = j + 1; // skip duplicates
        }
        return count1;
    }
}
