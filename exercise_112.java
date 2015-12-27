/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public boolean hasPathSum(TreeNode root, int sum) {
        boolean a = false; 
        boolean b = false;
        if(root == null)
            return false;
        if(root.left == null && root.right == null)
            if(root.val == sum)
                return true;
            else
                return false;
        if(root.left != null)
            a = hasPathSum(root.left, sum - root.val);
        if(root.right != null)
            b = hasPathSum(root.right, sum - root.val);
        return (a||b);
    }
}