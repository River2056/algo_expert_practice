package com.river.problems.easy;

import java.util.ArrayList;
import java.util.List;

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
        root.left.right.left = new BinaryTree(10);
        System.out.printf("1. %s\n", branchSums(root));
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
    }
}
