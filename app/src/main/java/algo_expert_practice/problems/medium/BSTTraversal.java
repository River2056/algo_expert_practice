package algo_expert_practice.problems.medium;

import java.util.List;

/**
 * BSTTraversal
 */
public class BSTTraversal {

    public static List<Integer> inOrderTraverse(BST tree, List<Integer> array) {
        if (tree == null)
            return array;
        if (tree.left == null && tree.right == null) {
            array.add(tree.value);
            return array;
        }

        array = inOrderTraverse(tree.left, array);
        array.add(tree.value);
        array = inOrderTraverse(tree.right, array);
        return array;
    }

    public static List<Integer> preOrderTraverse(BST tree, List<Integer> array) {
        if (tree == null)
            return array;
        if (tree.left == null && tree.right == null) {
            array.add(tree.value);
            return array;
        }

        array.add(tree.value);
        array = preOrderTraverse(tree.left, array);
        array = preOrderTraverse(tree.right, array);
        return array;
    }

    public static List<Integer> postOrderTraverse(BST tree, List<Integer> array) {
        if (tree == null)
            return array;
        if (tree.left == null && tree.right == null) {
            array.add(tree.value);
            return array;
        }

        array = postOrderTraverse(tree.left, array);
        array = postOrderTraverse(tree.right, array);
        array.add(tree.value);
        return array;
    }

    static class BST {
        public int value;
        public BST left;
        public BST right;

        public BST(int value) {
            this.value = value;
        }
    }
}
