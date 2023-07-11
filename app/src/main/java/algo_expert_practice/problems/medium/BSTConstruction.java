package algo_expert_practice.problems.medium;

/**
 * BSTConstruction
 */
public class BSTConstruction {

    static class BST {
        public int value;
        public BST left;
        public BST right;

        public BST(int value) {
            this.value = value;
        }

        public BST insert(int value) {
            BST current = this;
            while (current != null) {
                if (current.value < value) {
                    if (current.right == null) {
                        current.right = new BST(value);
                        return this;
                    } else {
                        current = current.right;
                    }
                } else {
                    if (current.left == null) {
                        current.left = new BST(value);
                        return this;
                    } else {
                        current = current.left;
                    }
                }
            }

            return this;
        }

        public boolean contains(int value) {
            BST current = this;
            while (current != null) {
                if (current.value == value)
                    return true;

                if (current.value < value)
                    current = current.right;
                else
                    current = current.left;

            }
            return false;
        }

        public BST remove(int value) {
            if (value != this.value) {
                if (value < this.value && this.left != null) {
                    return this.left.remove(value);
                } else if (value > this.value && this.right != null) {
                    return this.right.remove(value);
                }
            } else {
                if (this.left == null && this.right == null)
                    return this;
                
                BST dest = this;
                BST leftMost = this.right;
                while (leftMost != null && leftMost.left != null) {
                    leftMost = leftMost.left;
                }
                
                if (leftMost != null && leftMost.left == null && leftMost.right == null) {
                    dest.value = leftMost.value;
                } else if (leftMost != null && leftMost.right != null) {
                    dest.value = leftMost.value;
                    leftMost.value = leftMost.right.value;
                    leftMost.right = null;
                }
            }
            return this;
        }
    }
}
