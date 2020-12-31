public class isSymmetric {
    public boolean Symmetric(TreeNode root) {
      return Recursion(root,root);  
    }
    public boolean Recursion(TreeNode left, TreeNode right){
        if(left == null && right == null){
            return true;
        }
        if(left == null || right == null){
            return false;
        }
        return (left.val == right.val) && Recursion(left.left, right.right) && Recursion(left.right, right.left);
    }
}
