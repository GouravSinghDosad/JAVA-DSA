class Solution {
    public int repeatedNTimes(int[] nums) {
        
        int need = nums.length/2;
        int val = 0;

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i: nums){
            map.put(i, map.getOrDefault(i,0)+1);
        }

        for(Map.Entry<Integer, Integer> entry: map.entrySet()){
            if(entry.getValue() == need){
                val = entry.getKey();
                break;
            }
        }

        return val;
    }
}