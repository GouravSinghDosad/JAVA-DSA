class Solution {
    public int fib(int n) {
        
        int one  = 0;
        int two = 1;

        int req = 0;

        for(int i = 1; i <= n; i++){
            req = one+two;
            one = two;
            two = req;
        }

        return one;
    }
}