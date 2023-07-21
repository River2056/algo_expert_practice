package algo_expert_practice.problems.medium;

/**
 * BinaryTreeDiameter
 */
public class BinaryTreeDiameter {

    int max = 0;

    static class BinaryTree {
        public int value;
        public BinaryTree left = null;
        public BinaryTree right = null;

        public BinaryTree(int value) {
            this.value = value;
        }
    }

    public int binaryTreeDiameter(BinaryTree tree) {
        helper(tree);
        return max;
    }

    private int helper(BinaryTree node) {
        int left = 0;
        int right = 0;
        if (node.left == null && node.right == null)
            return 0;
        if (node.left != null)
            left = helper(node.left) + 1;
        if (node.right != null)
            right = helper(node.right) + 1;

        if ((left + right) > max)
            max = left + right;

        return Math.max(left, right);
    }
}
