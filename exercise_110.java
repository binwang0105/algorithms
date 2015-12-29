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
    public boolean isBalanced(TreeNode root) {
        if(root == null)
            return true;
        int leftTreeDepth = maxDepth(root.left);
        int rightTreeDepth = maxDepth(root.right);
        if(Math.abs(maxDepth(root.left) - maxDepth(root.right)) > 1)
            return false;
        return (isBalanced(root.left)&&isBalanced(root.right));
    }
    
    public int maxDepth(TreeNode root){
        if(root == null)
            return 0;
        if(root.left == null && root.right == null)
            return 1;
        return (Math.max(maxDepth(root.left), maxDepth(root.right))+1);
    }
}

// base cases + falses的所有情况构成递归的所有可能出现的情况