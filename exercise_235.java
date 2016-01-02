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
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
       
        TreeNode node = null;
        
        while((p.val - root.val) * (q.val - root.val) > 0)
            if(p.val - root.val < 0)
                root = root.left;
            else
                root = root.right;
        return root;
    }
}
// 二叉树上判断相对位置使用value去判断
// 怎么找爸爸
// 只有两种情况

/* 以下语句被当作一个语句块
             if(p.val - root.val < 0)
                root = root.left;
            else
                root = root.right;

*/

/*
   *
     *
*/
/*
    *
*       *
*/