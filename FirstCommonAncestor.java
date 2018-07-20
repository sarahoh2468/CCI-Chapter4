import javax.swing.tree.TreeNode;

public class FirstCommonAncestor {
    /* Design an algorithm and write code to find the first common ancestor of two nodes
    in a binary tree. Avoid storing additional nodes in a data structure. NOTE: This is not
    necessarily a binary search tree
     */
    public TreeNode commonAncestor(TreeNode p, TreeNode q) {
        int difference = depth(p) - depth(q);
        TreeNode first = difference > 0 ? q : p;
        TreeNode second = difference > 0 ? p : q;
        second = goUpBy(second, Math.abs(difference));

        while (first != second && first != null && second != null) {
            first = first.parent;
            second = second.parent;
        }
        return first == null || second == null ? null : first;
    }
    public TreeNode goUpBy(TreeNode node, int difference) {
        while (difference > 0 && node != null) {
            node = node.parent;
            difference--;
        }
        return node;
    }
    public int depth(TreeNode node) {
        int depth = 0;
        while (node != null) {
            node = node.parent;
            depth++;
        }
        return depth;
    }
}
