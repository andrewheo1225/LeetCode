public class isSameTree {
    public boolean SameTree(TreeNode p, TreeNode q) {
        return Recursion(p,q);  
    }
    public boolean Recursion(TreeNode p, TreeNode q){
        if(p == null && q == null){
            return true;
        }
        if(p == null || q == null){
            return false;
        }
        return (p.val == q.val) && Recursion(p.left, q.left) && Recursion(p.right, q.right);
    }
}
