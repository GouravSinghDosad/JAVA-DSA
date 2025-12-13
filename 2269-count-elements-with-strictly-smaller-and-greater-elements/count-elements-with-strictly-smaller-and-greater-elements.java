class Solution {
    public int countElements(int[] nums) {
        
        if(nums.length == 1 || nums.length == 0 || nums.length == 2){
            return 0;
        }

        int max = Integer.MIN_VALUE;

        int i = 0;
        while(i < nums.length){
            max = Math.max(max, nums[i]);
            i++;
        }

        int min = Integer.MAX_VALUE;

        int j = 0;
        while(j < nums.length){
            min = Math.min(min, nums[j]);
            j++;
        }

        int k = 0;
        int count = 0;

        while(k < nums.length){
            if(nums[k] > min && nums[k] < max){
                count++;
            }
            k++;
        }

        return count;

    }
}