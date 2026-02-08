class Solution {
    public int maxFrequencyElements(int[] nums) {
        
        HashMap<Integer, Integer> freq = new HashMap<>();

        int max = 0;
        for(int i =0; i < nums.length; i++){
            freq.put(nums[i], freq.getOrDefault(nums[i],0)+1);
        }

        for(Map.Entry<Integer, Integer> entry: freq.entrySet()){
            if(entry.getValue() > max){
                max = entry.getValue();
            }
        }

        int count = 0;

        for(Map.Entry<Integer, Integer> entry: freq.entrySet()){
            if(entry.getValue() == max) count += entry.getValue() ;
        }

        return count;
    }
}