public class diameterOfBinaryTree {
    int length = 0;
    
    public int OfBinaryTree(TreeNode root) {
        maxDepth(root);
        return length;
    }
    
    private int maxDepth(TreeNode root) {
      if(root == null){
          return 0;
      }

      int left = maxDepth(root.left);
      int right = maxDepth(root.right);

      length = Math.max(length,left+right);

      return Math.max(right,left)+1;
    }

}
