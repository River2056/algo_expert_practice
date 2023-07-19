package algo_expert_practice.problems.medium;

import java.util.List;

/**
 * MinHeightBST
 */
public class MinHeightBST {

    public static BST minHeightBst(List<Integer> array) {
        // return construct(array, 0, array.size() - 1, null);
        return constructAttempt2(array, 0, array.size() - 1);
    }

    private static BST construct(List<Integer> array, int left, int right, BST parent) {
        if (left <= right) {
            int mid = ((right - left) / 2) + left;
            BST node = new BST(array.get(mid));
            if (parent != null) {
                if (node.value < parent.value)
                    parent.left = node;
                else
                    parent.right = node;
            }
            node.left = construct(array, left, mid - 1, node);
            node.right = construct(array, mid + 1, right, node);
            return node;
        }
        return null;
    }

    private static BST constructAttempt2(List<Integer> array, int left, int right) {
        if (left <= right) {
            int mid = ((right - left) / 2) + left;
            BST node = new BST(array.get(mid));
            node.left = constructAttempt2(array, left, mid - 1);
            node.right = constructAttempt2(array, mid + 1, right);
            return node;
        }
        return null;

    }

    static class BST {
        public int value;
        public BST left;
        public BST right;

        public BST(int value) {
            this.value = value;
            left = null;
            right = null;
        }

        public void insert(int value) {
            if (value < this.value) {
                if (left == null) {
                    left = new BST(value);
                } else {
                    left.insert(value);
                }
            } else {
                if (right == null) {
                    right = new BST(value);
                } else {
                    right.insert(value);
                }
            }
        }
    }
}
