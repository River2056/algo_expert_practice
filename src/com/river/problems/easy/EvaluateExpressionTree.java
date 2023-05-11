package com.river.problems.easy;

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

    public void test() {
        BinaryTree root = new BinaryTree(-1);
        root.left = new BinaryTree(-2);
        root.right = new BinaryTree(-3);

        root.left.left = new BinaryTree(-4);
        root.left.right = new BinaryTree(2);

        root.left.left.left = new BinaryTree(2);
        root.left.left.right = new BinaryTree(3);

        root.right.left = new BinaryTree(8);
        root.right.right = new BinaryTree(3);

        System.out.printf("1. %s\n", evaluateExpressionTree(root));
    }

    public static void main(String[] args) {
        EvaluateExpressionTree e = new EvaluateExpressionTree();
        e.test();
    }
}

class BinaryTree {
    int value;
    BinaryTree left;
    BinaryTree right;

    public BinaryTree(int value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }
}
