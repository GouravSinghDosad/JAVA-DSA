class Solution {
    public void sortColors(int[] nums) {
        
        int zeroC = 0;
        int oneC = 0;
        int twoC = 0;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0) zeroC++;
            else if(nums[i] == 1) oneC++;
            else if(nums[i] == 2) twoC++;
        }

        int index =0;
        while(index < zeroC){
            nums[index] = 0;
            index++;
        }
        while(index < oneC + zeroC){
            nums[index] = 1;
            index++;
        }
        while(index < nums.length){
            nums[index] = 2;
            index++;
        }
    }
}