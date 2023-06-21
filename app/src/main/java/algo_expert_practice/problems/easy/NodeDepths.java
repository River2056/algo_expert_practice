package algo_expert_practice.problems.easy;

import algo_expert_practice.model.BinaryTree;

public class NodeDepths {
    public static int nodeDepths(BinaryTree root) {
        return dfs(root, 0);
    }

    private static int dfs(BinaryTree node, int depth) {
        if (node == null)
            return 0;
        if (node.left == null && node.right == null)
            return depth;
        return dfs(node.left, depth + 1) + depth + dfs(node.right, depth + 1);
    }
}
