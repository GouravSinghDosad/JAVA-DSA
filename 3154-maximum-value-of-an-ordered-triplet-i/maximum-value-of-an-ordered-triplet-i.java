class Solution {
    public long maximumTripletValue(int[] nums) {
        
        long val = Long.MIN_VALUE;
        for(int i = 0; i < nums.length-2; i++){
            int first = nums[i];
            for(int j = i+1; j < nums.length-1; j++){
                int second = nums[j];
                for(int k = j+1; k < nums.length; k++){
                    long value = (long)(first - second)*nums[k];
                    val = Math.max(val, value);
                }
            }
        }

        if(val < 0) return 0;
        return val;
    }
}