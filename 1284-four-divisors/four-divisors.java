class Solution {
    public int sumFourDivisors(int[] nums) {
        
        

        int ans = 0;

        for(int i = 0; i < nums.length; i++){
            int count = 0;
        int sum = 0;
            for(int j = 1; j <= Math.sqrt(nums[i]); j++){
                if(nums[i]%j == 0){

                    int d1 = j;
                    int d2 = nums[i]/j;

                    
                    count++;
                    sum += d1;

                    if(d1 != d2){
                        count++;
                        sum+= d2;
                    }
                }
                if(count > 4) break;
            }

            if(count == 4){
                ans += sum;
            }
        }

        return ans;
    }
}