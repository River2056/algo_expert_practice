package algo_expert_practice.problems.medium;

/**
 * BSTConstruction
 */
public class BSTConstruction {

    public static class BST {
        public int value;
        public BST left;
        public BST right;

        public BST(int value) {
            this.value = value;
        }

        public BST insert(int value) {
            BST current = this;
            while (current != null) {
                if (current.value > value) {
                    if (current.left == null) {
                        current.left = new BST(value);
                        return this;
                    } else {
                        current = current.left;
                    }
                } else {
                    if (current.right == null) {
                        current.right = new BST(value);
                        return this;
                    } else {
                        current = current.right;
                    }
                }
            }

            return this;
        }

        public boolean contains(int value) {
            BST current = this;
            while (current != null) {
                if (current.value < value)
                    current = current.right;
                else if (current.value > value)
                    current = current.left;
                else
                    return true;
            }
            return false;
        }

        public BST remove(int value) {
            this.removeHelper(value, null);
            return this;
        }

        private void removeHelper(int value, BST parent) {
            BST current = this;
            BST previous = parent;
            while (current != null) {
                if (current.value < value) {
                    previous = current;
                    current = current.right;
                } else if (current.value > value) {
                    previous = current;
                    current = current.left;
                } else {
                    if (current.left != null && current.right != null) {
                        current.value = current.right.getMinValue();
                        current.right.removeHelper(current.value, current);
                    } else if (previous == null) {
                        if (current.left != null) {
                            current.value = current.left.value;
                            current.right = current.left.right;
                            current.left = current.left.left;
                        } else if (current.right != null) {
                            current.value = current.right.value;
                            current.left = current.right.left;
                            current.right = current.right.right;
                        }
                    } else if (previous != null && previous.left == current) {
                        previous.left = current.left == null ? current.right : current.left;
                    } else if (previous != null && previous.right == current) {
                        previous.right = current.left == null ? current.right : current.left;
                    }
                }
            }
        }

        private int getMinValue() {
            BST current = this;
            while (current != null && current.left != null) {
                current = current.left;
            }
            return current.value;
        }
    }
}
