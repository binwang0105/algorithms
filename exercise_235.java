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
// ���������ж����λ��ʹ��valueȥ�ж�
// ��ô�Ұְ�
// ֻ���������

/* ������䱻����һ������
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