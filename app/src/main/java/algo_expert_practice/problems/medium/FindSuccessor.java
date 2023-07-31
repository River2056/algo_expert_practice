package algo_expert_practice.problems.medium;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * FindSuccessor
 */
public class FindSuccessor {

    // This is an input class. Do not edit.
    static class BinaryTree {
        public int value;
        public BinaryTree left = null;
        public BinaryTree right = null;
        public BinaryTree parent = null;

        public BinaryTree(int value) {
            this.value = value;
        }
    }

    public BinaryTree findSuccessorSelf(BinaryTree tree, BinaryTree node) {
        List<BinaryTree> resultList = new ArrayList<>();
        dfs(tree, resultList);
        Iterator<BinaryTree> it = resultList.iterator();
        boolean found = false;
        BinaryTree result = null;
        while (it.hasNext()) {
            BinaryTree t = it.next();
            if (found)
                return t;
            
            if (node.value == t.value)
                found = true;
        }
        return result;
    }

    private void dfs(BinaryTree tree, List<BinaryTree> inOrderList) {
        if (tree == null)
            return;

        dfs(tree.left, inOrderList);
        inOrderList.add(tree);
        dfs(tree.right, inOrderList);
    }

    public BinaryTree findSuccessor(BinaryTree tree, BinaryTree node) {
        if (node.right != null)
            return getLeftmostChild(node.right);
        return getRightmostParent(node);
    }

    private BinaryTree getLeftmostChild(BinaryTree node) {
        BinaryTree current = node;
        while (current != null && current.left != null)
            current = current.left;
        return current;
    }

    private BinaryTree getRightmostParent(BinaryTree node) {
        BinaryTree current = node;
        while (current != null && current.parent != null && current.parent.right == current) {
            current = current.parent;
        }
        return current.parent;
    }
}
