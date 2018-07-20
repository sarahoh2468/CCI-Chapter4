import javax.swing.tree.TreeNode;

public class Successor {
    /* Write an algorithm to find the "next" node (i.e. in-order successor) of a given node
    in a binary search tree. You may assume that each node has a link to its parent
     */
    public TreeNode inorderSucc(TreeNode n) {
        if (n == null) {
            return null;
        }
        if (n.right != null) {
            return leftMostChild(n.right);
        }
        else {
            TreeNode q = n;
            TreeNode x = q.parent;
            while (x != null && x.left != q) {
                q = x;
                x = x.parent;
            }
            return x;
        }
    }
    TreeNode leftMostChild(TreeNode n) {
        if (n == null) {
            return null;
        }
        while (n.left != null) {
            n = n.left;
        }
        return n;
    }
}
