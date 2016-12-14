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

    // �ѵ�ǰ���ǵĽڵ���Ϊ������ dfs �ṹ
    private int dfs(TreeNode root, int num){
        // ֻ��Ҷ�ڵ��������㣬����˵��������Ч path
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