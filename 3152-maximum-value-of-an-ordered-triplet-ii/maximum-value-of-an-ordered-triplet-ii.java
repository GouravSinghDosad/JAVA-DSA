class Solution {
    public long maximumTripletValue(int[] nums) {
        

        long val = 0;
        long maxI = nums[0];
        long maxD = 0;

        for(int k = 1; k < nums.length; k++){

            val = Math.max(val, maxD*nums[k]);
            maxD = Math.max(maxD, maxI-nums[k]);
            maxI = Math.max(maxI, nums[k]);
        }

        
        return val;
    }
}