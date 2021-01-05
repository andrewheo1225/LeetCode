public class rangeSumBST {
    int answer;
    public int rangeSumBST(TreeNode root, int low, int high) {
        answer = 0;
        if(root == null)
            return 0;
        
        recursion( root,  low,  high);
        return answer;
    }

    public void recursion(TreeNode root, int low, int high) {
       if(root != null){
           if(root.val >= low && root.val <= high){
               answer+=root.val;
           }
           if(low< root.val){
               recursion(root.left,low,high);
           }
          if(root.val < high){
               recursion(root.right,low,high);
           }
       }
    }
}
