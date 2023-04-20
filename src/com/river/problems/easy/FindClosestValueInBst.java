package com.river.problems.easy;

import java.util.HashMap;
import java.util.Map;

public class FindClosestValueInBst {

    public static int findClosestValueInBst(BST tree, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        traverseTree(tree, target, map);
        int minDiff = map.entrySet().stream().map(Map.Entry::getKey).min((a, b) -> a - b).get();
        return map.get(minDiff);
    }

    private static void traverseTree(BST node, int target, Map<Integer, Integer> map) {
        int diff = Math.abs(node.value - target);
        map.put(diff, node.value);
        if (node.left != null && node.right != null) {
            if (target > node.value)
                traverseTree(node.right, target, map);
            else
                traverseTree(node.left, target, map);
        }

        if (node.left == null && node.right == null)
            return;

        if (node.left == null)
            traverseTree(node.right, target, map);
        else
            traverseTree(node.left, target, map);
    }

    private static void test() {
        BST root = new BST(10);
        root.left = new BST(5);
        root.right = new BST(15);

        root.left.left = new BST(2);
        root.left.right = new BST(5);
        root.left.left.left = new BST(1);

        root.right.left = new BST(13);
        root.right.right = new BST(22);
        root.right.left.right = new BST(14);

        int target = 12;
        int result = findClosestValueInBst(root, target);
        System.out.printf("1. %s\n", result);
    }

    public static void main(String[] args) {
        test();
    }
}

class BST {
    int value;
    BST left;
    BST right;

    public BST(int value) {
        this.value = value;
    }
}
