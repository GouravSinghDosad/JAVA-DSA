class Solution {
    long totalSum = 0;
    long maxProduct = 0;
    int MOD = 1_000_000_007;

    public int maxProduct(TreeNode root) {
        // 1st DFS: compute total sum
        totalSum = dfsSum(root);

        // 2nd DFS: compute max product
        dfsProduct(root);

        return (int)(maxProduct % MOD);
    }

    private long dfsSum(TreeNode node) {
        if (node == null) return 0;
        return node.val + dfsSum(node.left) + dfsSum(node.right);
    }

    private long dfsProduct(TreeNode node) {
        if (node == null) return 0;

        long left = dfsProduct(node.left);
        long right = dfsProduct(node.right);

        long subTreeSum = node.val + left + right;

        long product = subTreeSum * (totalSum - subTreeSum);
        maxProduct = Math.max(maxProduct, product);

        return subTreeSum;
    }
}
