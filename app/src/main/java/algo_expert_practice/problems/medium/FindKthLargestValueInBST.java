package algo_expert_practice.problems.medium;

import java.util.ArrayList;
import java.util.List;

/**
 * FindKthLargestValueInBST
 */
public class FindKthLargestValueInBST {

    Integer visited = 0;
    Integer lastValue = 0;

    // This is an input class. Do not edit.
    static class BST {
        public int value;
        public BST left = null;
        public BST right = null;

        public BST(int value) {
            this.value = value;
        }
    }

    public int findKthLargestValueInBst(BST tree, int k) {
        List<Integer> result = new ArrayList<>();
        traverse(tree, result);
        return !result.isEmpty() ? result.get(k - 1) : -1;
    }

    public int findKthLargestValueInBstAttempt2(BST tree, int k) {
        traverseAttempt2(tree, k);
        return lastValue;
    }

    private void traverse(BST node, List<Integer> result) {
        if (node == null) {
            return;
        }
        traverse(node.right, result);
        result.add(node.value);
        traverse(node.left, result);
    }

    private void traverseAttempt2(BST tree, int k) {
        if (tree == null) {
            return;
        }
        traverseAttempt2(tree.right, k);
        visited++;
        if (visited == k) {
            lastValue = tree.value;
            return;
        }
        traverseAttempt2(tree.left, k);
    }
}
