public class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        ArrayList<Integer> res = new ArrayList<Integer>();
        if(root == null){
            return res;
        }
        helper(root, res);
        return res;
    }
    
    private void helper(TreeNode root, ArrayList<Integer> res){
        if(root == null){
            return;
        }
        res.add(root.val);
        helper(root.left, res);
        helper(root.right, res);
    }
}

// 递归
// 复杂度
// 时间O(n), 空间O(1)