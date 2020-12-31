public class isCousins {
    TreeNode leftParent = null;
    TreeNode rightParent = null;
    int depth1 = 0, depth2 = 0;

    public boolean isCousins(TreeNode root, int x, int y) {
        getDepthAndParent(root, x, y, 0, null);
        return depth1 == depth2 && leftParent != rightParent;
    }

    public void getDepthAndParent(TreeNode root, int x, int y, int depth, TreeNode parent) {
        if (root == null) {
            return;
        } else if (root.val == x) {
            leftParent = parent;
            depth1 = depth;
        } else if (root.val == y) {
            rightParent = parent;
            depth2 = depth;
        } else {
            getDepthAndParent(root.left, x, y, depth + 1, root);
            getDepthAndParent(root.right, x, y, depth + 1, root);
        }
    }
}
