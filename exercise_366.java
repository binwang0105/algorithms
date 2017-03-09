public class Solution {
    public List<List<Integer>> findLeaves(TreeNode root) {
        List<List<Integer>> res = new LinkedList<List<Integer>>();
        helper(res, root);
        return res;
    }
    
    private int helper(List<List<Integer>> res, TreeNode root) {
        if(root == null)
            return -1; //bu shi 0
        
        int index = 0;
        index = Math.max(helper(res, root.left), helper(res, root.right))+1;
        if(res.size()<index+1){
            res.add(new LinkedList<Integer>());
        }
        res.get(index).add(root.val);
        return index;
    }
}