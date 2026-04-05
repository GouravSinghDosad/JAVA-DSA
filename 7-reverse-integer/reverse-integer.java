class Solution {
    public int reverse(int x) {

        
        // String s = "";
        int N = 0;

        while(x != 0){
            int temp = x % 10;

            if(N > Integer.MAX_VALUE/10 || N < Integer.MIN_VALUE/10){
                return 0;
            }

            N = N*10 + temp;
            x = x/10;

        }

        // N = Integer.parseInt(s);
        return N;
    }
}