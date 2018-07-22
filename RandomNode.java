import javax.swing.tree.TreeNode;
import java.util.Random;

public class RandomNode {
    /* You are implementing a binary tree class from scratch which, in addition to insert,
    find, and delete, has a method getRandomNode() which returns a random node from the
    tree. All nodes should be equally likely to be chosen. Design and implement an
    algorithm for getRandomNode, and explain how you would implement the rest of the methods
     */
    class Tree {
        TreeNode root = null;

        public int size() {
            return root == null ? 0 : root.size();
        }

        public TreeNode getRandomNode() {
            if (root == null) {
                return null;
            }
            Random random = new Random();
            int i = random.nextInt(size());
            return root.getIthNode(i);
        }

        public void insertInOrder(int value) {
            if (root == null) {
                root = new TreeNode(value);
            }
            else {
                root.insertInOrder(value);
            }
        }
    }
    class TreeNode {
        public TreeNode getIthNode(int i) {
            int leftSize = left == null ? 0 : left.size();
            if (i < leftSize) {
                return left.getIthNode(i);
            }
            else if (i == leftSize) {
                return this;
            }
            else {
                return right.getIthNode(i - (leftSize + 1));
            }
        }
        public void insertInOrder(int d) {}
        public int size() {return size;}
        public TreeNode find(int d) {}
    }
}
