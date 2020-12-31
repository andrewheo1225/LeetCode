public class invertTree {

    public TreeNode Tree(TreeNode root) {
        return Recursion(root);
    }

    public TreeNode Recursion(TreeNode root) {
        if (root == null)
            return null;

        TreeNode right = Recursion(root.right);
        TreeNode left = Recursion(root.left);
        root.right = left;
        root.left = right;

        return root;
    }

}
