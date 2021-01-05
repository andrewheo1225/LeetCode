public class searchBST {
    public TreeNode search(TreeNode root, int val) {
        if(root == null){
            return root;
        }
        if(root.val == val){
            return root;
        }else if(root.val > val){
            return search(root.left,val);
        }else if (root.val < val){
            return search(root.right,val);
        }
        return null;
   
}
