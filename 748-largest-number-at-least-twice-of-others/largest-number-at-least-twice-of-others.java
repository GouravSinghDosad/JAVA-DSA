class Solution {
    public int dominantIndex(int[] nums) {
        
        int[] arr = new int[nums.length];

        for(int i = 0; i < nums.length; i++){
            arr[i] = nums[i];
        }

        Arrays.sort(arr);

        int largest = arr[arr.length-1];

        for(int i = 0; i < arr.length; i++){
            if(arr[i]*2 > largest && arr[i] != largest) return -1;
        }

        int index = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == largest){
                index = i;
                break;
            }
        }

        return index;
    }
}