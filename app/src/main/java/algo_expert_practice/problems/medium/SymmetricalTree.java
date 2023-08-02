package algo_expert_practice.problems.medium;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import java.util.Optional;

/**
 * SymmetricalTree
 */
public class SymmetricalTree {

    // This is an input class. Do not edit.
    static class BinaryTree {
        public int value;
        public BinaryTree left = null;
        public BinaryTree right = null;

        public BinaryTree(int value) {
            this.value = value;
        }
    }

    public boolean symmetricalTreeSelf(BinaryTree tree) {
        List<Integer> subtreeLeft = new ArrayList<>();
        List<Integer> subtreeRight = new ArrayList<>();
        traverseLeftDfs(tree.left, subtreeLeft);
        traverseRightDfs(tree.right, subtreeRight);
        return subtreeLeft.equals(subtreeRight);
    }

    private void traverseLeftDfs(BinaryTree node, List<Integer> res) {
        if (node == null)
            return;
        traverseLeftDfs(node.left, res);
        res.add(node.value);
        traverseLeftDfs(node.right, res);
    }

    private void traverseRightDfs(BinaryTree node, List<Integer> res) {
        if (node == null)
            return;
        traverseRightDfs(node.right, res);
        res.add(node.value);
        traverseRightDfs(node.left, res);
    }

    /**
     * "nodes": [
     * {"id": "1", "left": "2", "right": "2-2", "value": 1},
     * {"id": "2", "left": "3", "right": "4", "value": 2},
     * {"id": "2-2", "left": "4-2", "right": "3-2", "value": 2},
     * {"id": "3", "left": null, "right": null, "value": 3},
     * {"id": "3-2", "left": null, "right": null, "value": 3},
     * {"id": "4", "left": null, "right": null, "value": 4},
     * {"id": "4-2", "left": null, "right": "5", "value": 4},
     * {"id": "5", "left": null, "right": null, "value": 5}
     * ],
     * 1
     * / \
     * 2 2
     * / \ / \
     * 3 4 4 3
     * \
     * 5
     */
    public boolean symmetricalTree(BinaryTree tree) {
        if (tree.left == null && tree.right == null)
            return true;
        Deque<Optional<BinaryTree>> stackLeft = new ArrayDeque<>();
        Deque<Optional<BinaryTree>> stackRight = new ArrayDeque<>();
        stackLeft.add(Optional.ofNullable(tree.left));
        stackRight.add(Optional.ofNullable(tree.right));

        while (!stackLeft.isEmpty()) {
            BinaryTree left = stackLeft.removeLast().orElse(null);
            BinaryTree right = stackRight.removeLast().orElse(null);
            if (left == null || right == null)
                return false;
            if (left.value != right.value)
                return false;
            if (left.left != null || right.right != null) {
                stackLeft.add(Optional.ofNullable(left.left));
                stackRight.add(Optional.ofNullable(right.right));
            }

            if (left.right != null || right.left != null) {
                stackLeft.add(Optional.ofNullable(left.right));
                stackRight.add(Optional.ofNullable(right.left));
            }
        }
        return true;
    }

    public static void main(String[] args) {
        BinaryTree a = new BinaryTree(1);
        a.left = new BinaryTree(2);
        a.right = new BinaryTree(2);

        a.left.left = new BinaryTree(3);
        a.left.right = new BinaryTree(4);
        a.left.left.left = new BinaryTree(5);
        a.left.left.right = new BinaryTree(6);

        a.right.left = new BinaryTree(4);
        a.right.right = new BinaryTree(3);
        a.right.right.left = new BinaryTree(6);
        a.right.right.right = new BinaryTree(5);
    }
}
