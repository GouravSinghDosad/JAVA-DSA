class Solution {
    public int reverseBits(int n) {

        int ans = 0;

        for (int i = 0; i < 32; i++) {
            ans <<= 1;          // make space for next bit
            ans |= (n & 1);     // take last bit of n
            n >>>= 1;           // unsigned shift
        }

        return ans;
    }
}