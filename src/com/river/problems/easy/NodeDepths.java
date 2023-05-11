package com.river.problems.easy;

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

    private static void test() {
        BinaryTree root = new BinaryTree(1);
        root.left = new BinaryTree(2);
        root.right = new BinaryTree(3);

        root.left.left = new BinaryTree(4);
        root.left.right = new BinaryTree(5);
        root.right.left = new BinaryTree(6);
        root.right.right = new BinaryTree(7);

        root.left.left.left = new BinaryTree(8);
        root.left.left.right = new BinaryTree(9);

        System.out.printf("1. %s\n", nodeDepths(root));
    }

    public static void main(String[] args) {
        test();
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
