class Solution {
    public int minDeletionSize(String[] strs) {

        int n = strs.length;
        int m = strs[0].length();

        boolean[] sorted = new boolean[n]; // sorted[i] means strs[i-1] < strs[i]
        int deletions = 0;

        for (int col = 0; col < m; col++) {

            // Step 1: check if this column breaks lexicographic order
            boolean needDelete = false;
            for (int row = 1; row < n; row++) {
                if (!sorted[row] && 
                    strs[row].charAt(col) < strs[row - 1].charAt(col)) {
                    needDelete = true;
                    break;
                }
            }

            // Step 2: if bad column, delete it
            if (needDelete) {
                deletions++;
                continue;
            }

            // Step 3: update sorted status
            for (int row = 1; row < n; row++) {
                if (!sorted[row] &&
                    strs[row].charAt(col) > strs[row - 1].charAt(col)) {
                    sorted[row] = true;
                }
            }
        }

        return deletions;
    }
}
