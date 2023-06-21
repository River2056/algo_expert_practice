package algo_expert_practice.problems.easy;

import algo_expert_practice.model.BinaryTree;

public class EvaluateExpressionTree {
    public int evaluateExpressionTree(BinaryTree tree) {
        return dfs(tree);
    }

    private int dfs(BinaryTree node) {
        if (node.left == null && node.right == null)
            return node.value;
        int left = dfs(node.left);
        int right = dfs(node.right);
        int result = 0;
        if (node.value < 0) {
            switch (node.value) {
                case -1:
                    result = left + right;
                    break;
                case -2:
                    result = left - right;
                    break;
                case -3:
                    result = left / right;
                    break;
                case -4:
                    result = left * right;
                    break;
            }
        }
        return result;
    }
}
