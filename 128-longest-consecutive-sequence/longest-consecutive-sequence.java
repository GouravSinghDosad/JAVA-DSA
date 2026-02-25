class Solution {
    public int longestConsecutive(int[] nums) {
        

        if(nums.length == 0) return 0;
        if(nums.length == 1) return 1;
        Arrays.sort(nums);

        int count = 1;
        int longest = 1;

        for(int i = 1; i < nums.length; i++){

            if(nums[i] == nums[i-1]) continue;

            if(nums[i] == nums[i-1]+1) count++;
            else{
                longest = Math.max(longest, count);
                count = 1;
            }
           
        }

        return Math.max(longest, count);
    }
}