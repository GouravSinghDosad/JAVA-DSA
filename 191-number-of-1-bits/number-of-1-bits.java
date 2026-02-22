class Solution {
    public int hammingWeight(int n) {
        
        int setBits = 0;

        while(n > 0){
            int curr = n%2;
            if(curr == 1) setBits++;

            n = n/2;
        }

        return setBits;
    }
}