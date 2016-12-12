public class Solution {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
       List<List<Integer>> rst = new ArrayList<List<Integer>>();
        dfs(rst, root, 0);
        Collections.reverse(rst);
        return rst;
    }

    private void dfs(List<List<Integer>> rst, TreeNode root, int level){
        if(root == null) return;

        if(level >= rst.size()){
            rst.add(new ArrayList<Integer>());
        }

        rst.get(level).add(root.val);

        dfs(rst, root.left, level + 1);
        dfs(rst, root.right, level + 1);
    }
}