class Solution {
    public int smallestNumber(int n) {
        
        int num = 2;
        boolean stat = false;

        int i = 1;

        while(num <= n){
            num = num*2;
            i++;
        }

        return num-1;
    }
}