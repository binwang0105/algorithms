public class Solution {
    int sum = 0;
    public int sumOfLeftLeaves(TreeNode root) {
        if(root == null)
            return 0;
        helper(root);
        return sum;
    }
    
    private void helper(TreeNode root){
        if(root == null)
            return;
        
        if(root.left != null && root.left.left == null && root.left.right == null){
             sum += root.left.val;
        }
        helper(root.left);
        helper(root.right);
    }
}