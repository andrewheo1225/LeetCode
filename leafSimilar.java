import java.util.*;

public class leafSimilar {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> leaves1 = new ArrayList<>();
        List<Integer> leaves2 = new ArrayList<>();
        leaf(root1, leaves1);
        leaf(root2, leaves2);
        return leaves1.equals(leaves2);
    }

    public void leaf(TreeNode node, List<Integer> leafValues) {
        if (node != null) {
            if (node.left == null && node.right == null)
                leafValues.add(node.val);
            else {
                leaf(node.left, leafValues);
                leaf(node.right, leafValues);
            }
        }
    }
}
