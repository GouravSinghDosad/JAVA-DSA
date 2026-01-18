/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */
var twoSum = function(nums, target) {
    
    for(let i = 0; i < nums.length; i++){
        let current = nums[i];
        let needed = target - current;
        for(let j = i+1; j< nums.length; j++){
            if(nums[j] == needed){
                return [i, j];
            }
        }
    }
};