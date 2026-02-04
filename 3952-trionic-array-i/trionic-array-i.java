class Solution {
    public boolean isTrionic(int[] nums) {
        
        int p = 0;
        int q = 0;
        
        int n= nums.length;
        if(n<=3) return false;

        int count1 = 0;
        int count2 = 0 ;


        for(int i = 0; i < nums.length-1; i++){

            if(nums[i] == nums[i+1]) return false;

            if(nums[i] > nums[i+1]){
                p = i;
                break;
            }
            count1++;
        }

        if(count1 == 0) return false;
        if(p == n-1) return false;

        for(int j = p; j < nums.length-1; j++){

            if(nums[j] == nums[j+1]) return false;

            if(nums[j] < nums[j+1]){
                q = j;
                break;
            }
            count2++;
        }

        if( count2 == 0) return false;
        if(q == n-1) return false;

        for(int k = q; k < nums.length-1; k++){

            if(nums[k] == nums[k+1]) return false;

            if(nums[k] > nums[k+1]){
                return false;
            }
        }

        return true;
    }
}