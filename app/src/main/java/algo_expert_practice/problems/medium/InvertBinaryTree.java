package algo_expert_practice.problems.medium;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * InvertBinaryTree
 */
public class InvertBinaryTree {

    static class BinaryTree {
        public int value;
        public BinaryTree left;
        public BinaryTree right;

        public BinaryTree(int value) {
            this.value = value;
        }
    }

    public static void invertBinaryTreeSelfAttempt(BinaryTree tree) {
        Deque<BinaryTree> queue = new ArrayDeque<>();
        queue.add(tree);

        while (!queue.isEmpty()) {
            BinaryTree node = queue.poll();
            if (node.left != null)
                queue.add(node.left);
            if (node.right != null)
                queue.add(node.right);

            if (node.left != null && node.right != null) {
                BinaryTree temp = node.left;
                node.left = node.right;
                node.right = temp;
            } else if (node.left == null && node.right != null) {
                node.left = node.right;
                node.right = null;
            } else if (node.left != null && node.right == null) {
                node.right = node.left;
                node.left = null;
            }
        }
    }

    public static void invertBinaryTree(BinaryTree tree) {
        if (tree == null) {
            return;
        }

        if (tree.left != null && tree.right != null) {
            BinaryTree temp = tree.left;
            tree.left = tree.right;
            tree.right = temp;
        } else if (tree.left == null && tree.right != null) {
            tree.left = tree.right;
            tree.right = null;
        } else if (tree.left != null && tree.right == null) {
            tree.right = tree.left;
            tree.left = null;
        }

        invertBinaryTree(tree.left);
        invertBinaryTree(tree.right);
    }

}
