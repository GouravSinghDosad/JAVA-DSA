class Solution {
    public int threeSumClosest(int[] nums, int target) {
        
        

        Arrays.sort(nums);
int sum = nums[0] + nums[1] + nums[2];
        for(int i = 0; i < nums.length-2; i++){
            int first = nums[i];
            int left = i+1;
            int right = nums.length-1;

            while(left < right){
                int curr = first + nums[left] + nums[right];
                int diff = Math.abs(target - curr);
                int diff2 = Math.abs(target - sum);

                
                if( diff2 < diff) sum = sum;
                else if(diff2 > diff && sum != target){
                        sum = curr;
                } 

                if(curr > target) right--;
                else left++;
            }
        }

        return sum;
    }
}