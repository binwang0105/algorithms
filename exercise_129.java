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
    
    public int sumNumbers(TreeNode root) {
        return dfs(root, 0);
    }

    // 把当前考虑的节点作为参数的 dfs 结构
    private int dfs(TreeNode root, int num){
        // 只在叶节点上做计算，这里说明不是有效 path
        if(root == null) return 0;

        // -------------ADD----------------
        num += root.val;

        // ------------Leaf Node-----------
        if(root.left == null && root.right == null){
            return num;
        }

        // ------------DFS------------------
        int left = dfs(root.left, num * 10);
        int right = dfs(root.right, num * 10);

        // --------Backtracking------------
        num -= root.val;

        return left + right;
    }
}