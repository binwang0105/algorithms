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
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> rst = new ArrayList<List<Integer>>();
        if(root == null) return rst;
        dfs(rst, root, new ArrayList<Integer>(), 0, sum);
        return rst;
    }

    private void dfs(List<List<Integer>> rst, TreeNode root, List<Integer> list, int curSum, int targetSum){
        if(root == null) return;

        list.add(root.val);
        curSum += root.val;

        if(root.left == null && root.right == null){
            if(curSum == targetSum){
                rst.add(new ArrayList<Integer>(list));
                list.remove(list.size() - 1);
                return;
            } 
        }

        dfs(rst, root.left, list, curSum, targetSum);
        dfs(rst, root.right, list, curSum, targetSum);
        curSum -= root.val;
        list.remove(list.size() - 1);
    }
}