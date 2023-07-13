package algo_expert_practice.problems.medium;

public class ValidateBST {
    public static boolean validateBst(BST tree) {
        return validateHelper(tree, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    private static boolean validateHelper(BST tree, int min, int max) {
        if (tree == null)
            return true;
        if (tree.value < min || tree.value >= max)
            return false;
        boolean left = validateHelper(tree.left, min, tree.value);
        boolean right = validateHelper(tree.right, tree.value, max);
        return left && right;
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
