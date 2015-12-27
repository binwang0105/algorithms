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
    public int minDepth(TreeNode root) {
        if(root == null) 
            return 0;
        if(root.left == null && root.right == null )
            return 1;
        if(root.left == null && root.right != null )
            return minDepth(root.right)+1;
        if(root.right == null && root.left != null)
            return minDepth(root.left)+1;
        return Math.min(minDepth(root.left), minDepth(root.right))+1;
    }
}
//��3��base cases: 0->0->0   0<-0<-0<-0    0