public class Solution {
    public int countUnivalSubtrees(TreeNode root) {
        if(root == null)
            return 0;
        return isUniversal(root)? countUnivalSubtrees(root.left) + countUnivalSubtrees(root.right) + 1 : countUnivalSubtrees(root.left) + countUnivalSubtrees(root.right);
    }
    
    public boolean isUniversal(TreeNode root){
        if(root == null)
            return true;
        if(root.left != null && root.val != root.left.val)
            return false;
        if(root.right != null && root.val != root.right.val)
            return false;
        return isUniversal(root.left) && isUniversal(root.right);
    }
}