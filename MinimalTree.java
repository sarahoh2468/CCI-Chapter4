import javax.swing.tree.TreeNode;

public class MinimalTree {
    /* Given a sorted (increasing order) array with unique integer elements, write an
    algorithm to create a binary search tree with minimal height
     */

    public TreeNode sortedArrayToBST(int[] num) {
        int length = num.length;
        return helper(num, 0, length-1);
    }
    private TreeNode helper(int[] num, int l, int h) {
        if (l > h) {
            return null;
        }
        else {
            int mid = (l+h) /2;
            TreeNode node = new TreeNode(num[mid]);
            node.left = helper(num, l, mid-1);
            node.right = helper(num, mid+1, h);
            return node;
        }
    }
}
