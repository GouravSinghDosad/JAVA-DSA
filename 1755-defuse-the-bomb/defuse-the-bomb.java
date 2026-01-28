class Solution {
    public int[] decrypt(int[] code, int k) {

        int n = code.length;
        int[] result = new int[n];

        for (int i = 0; i < n; i++) {

            int sum = 0; // reset for every index

            // Case 1: k == 0
            if (k == 0) {
                result[i] = 0;
            }

            // Case 2: k > 0 (next k elements)
            else if (k > 0) {

                for (int j = 1; j <= k; j++) {
                    sum += code[(i + j) % n];
                }

                result[i] = sum;
            }

            // Case 3: k < 0 (previous k elements)
            else {

                int times = -k; // make k positive

                for (int j = 1; j <= times; j++) {
                    sum += code[(i - j + n) % n];
                }

                result[i] = sum;
            }
        }

        return result;
    }
}
