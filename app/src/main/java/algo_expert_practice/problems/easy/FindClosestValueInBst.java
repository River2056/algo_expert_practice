package algo_expert_practice.problems.easy;

public class FindClosestValueInBst {

    public static int findClosestValueInBst(BST tree, int target) {
        return traverseTree(tree, target, Integer.MAX_VALUE, 0);
    }

    private static int traverseTree(BST node, int target, int abs, int closest) {
        if (node == null)
            return closest;

        int diff = Math.abs(target - node.value);
        if (diff < abs) {
            abs = diff;
            closest = node.value;
        }

        if (target > node.value)
            return traverseTree(node.right, target, abs, closest);
        else if (target < node.value)
            return traverseTree(node.left, target, abs, closest);
        else
            return closest;
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
