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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q == null)
            return true;
        if(p != null && q == null)
            return false;
        if(p == null && q != null)
            return false;
        if(p.val != q.val)
            return false;
        else
            return (isSameTree(p.left, q.left) && isSameTree(p.right, q.right));
    }
}

// 查看左右子树是否存在，并且当前结点的数值是否相等