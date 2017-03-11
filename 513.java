public class Solution {
    public int findBottomLeftValue(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        q.offer(root);
        while(!q.isEmpty()){
            List<Integer> intList = new ArrayList<Integer>();
            int size = q.size();
            for(int i = 0; i < size; i++){
                TreeNode n = q.poll();
                intList.add(n.val);
                if(n.left != null)
                    q.offer(n.left);
                if(n.right != null)
                    q.offer(n.right);
            }
            list.add(intList);
        }
        return list.get(list.size()-1).get(0);
    }
}