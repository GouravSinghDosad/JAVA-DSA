class Solution {
    static final long MOD = 1_000_000_007;

    public int countPermutations(int[] c) {
        int n = c.length;

        Integer[] idx = new Integer[n];
        for (int i = 0; i < n; i++) idx[i] = i;

        // sort all except 0
        Arrays.sort(idx, 1, n, (a, b) -> {
            if (c[a] != c[b]) return Integer.compare(c[a], c[b]);
            return Integer.compare(a, b);
        });

        long[] dp = new long[n];
        dp[0] = 1;
        long unlocked = 1;

        for (int k = 1; k < n; k++) {
            int i = idx[k];

            boolean ok = false;
            for (int j = 0; j < k; j++) {
                int p = idx[j];
                if (p < i && c[p] < c[i]) {
                    ok = true;
                    break;
                }
            }

            if (!ok) return 0;

            dp[k] = unlocked;
            unlocked++;
        }

        long ans = 1;
        for (long x : dp) ans = (ans * x) % MOD;
        return (int) ans;
    }
}
