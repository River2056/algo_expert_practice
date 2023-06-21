package algo_expert_practice.problems.easy;

import java.util.ArrayList;
import java.util.List;

import algo_expert_practice.model.BinaryTree;

public class BranchSums {

    public static List<Integer> branchSums(BinaryTree root) {
        List<Integer> result = new ArrayList<>();
        traverseTree(root, 0, result);
        return result;
    }

    private static void traverseTree(BinaryTree node, int runningSum, List<Integer> results) {
        if (node == null)
            return;

        int currentSum = runningSum + node.value;
        if (node.left == null && node.right == null) { 
            results.add(currentSum);
            return;
        }
        traverseTree(node.left, currentSum, results);
        traverseTree(node.right, currentSum, results);
    }
}
