package algo_expert_practice.problems.medium;

import java.util.ArrayList;
import java.util.List;

/**
 * ReconstructBST
 */
public class ReconstructBST {

    Integer count = 0;

    static class BST {
        public int value;
        public BST left = null;
        public BST right = null;

        public BST(int value) {
            this.value = value;
        }
    }

    public BST reconstructBst(ArrayList<Integer> preOrderTraversalValues) {
        return helper(preOrderTraversalValues, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    private BST helper(List<Integer> list, int min, int max) {
        if (list.size() == count)
            return null;

        BST root = new BST(list.get(count));
        System.out.printf("count: %s, min: %s, max: %s%n", count, min, max);
        if (root.value < min || root.value >= max)
            return null;
        count++;

        root.left = helper(list, min, root.value);
        root.right = helper(list, root.value, max);
        return root;
    }
}
