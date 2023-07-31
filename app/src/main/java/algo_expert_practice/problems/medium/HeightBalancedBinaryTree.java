package algo_expert_practice.problems.medium;

/**
 * HeightBalancedBinaryTree
 */
public class HeightBalancedBinaryTree {

    // This is an input class. Do not edit.
    static class BinaryTree {
        public int value;
        public BinaryTree left = null;
        public BinaryTree right = null;

        public BinaryTree(int value) {
            this.value = value;
        }
    }

    public boolean heightBalancedBinaryTree(BinaryTree tree) {
        int diff = Math.abs(dfs(tree.left) - dfs(tree.right));
        if (diff > 1)
            return false;
        boolean res;
        if (tree.left != null) {
            res = heightBalancedBinaryTree(tree.left);
            if (!res)
                return res;
        }

        if (tree.right != null) {
            res = heightBalancedBinaryTree(tree.right);
            if (!res)
                return res;
        }

        return true;
    }

    private int dfs(BinaryTree node) {
        if (node == null) {
            return 0;
        }
        int left = dfs(node.left);
        int right = dfs(node.right);

        return Math.max(left, right) + 1;
    }
}
