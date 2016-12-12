public class Solution {
    
    public int largestBSTSubtree(TreeNode root) {
        if(root == null) 
            return 0;
        if(isBST(root, null, null)) 
            return getSize(root);
        return Math.max(largestBSTSubtree(root.left), largestBSTSubtree(root.right));
    }
    
    private boolean isBST(TreeNode root, Integer min, Integer max){
        if(root == null)
            return true;
        if(max != null && root.val >= max)
            return false;
        if(min != null && root.val <= min)
            return false;
        return isBST(root.left, min, root.val) && isBST(root.right, root.val, max);
    }
    
    private int getSize(TreeNode root){
        if(root == null)
            return 0;
        
        return getSize(root.left) + getSize(root.right) + 1;
    }
}