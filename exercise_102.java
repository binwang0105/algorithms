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
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        if(root == null)
            return list;
        queue.offer(root);
        while(!queue.isEmpty()){
            List<Integer> intList = new ArrayList<Integer>();
            int levelNum = queue.size();
            for(int i = 0; i < levelNum; i++){
                if(queue.peek().left != null)
                    queue.offer(queue.peek().left);
                if(queue.peek().right != null)
                    queue.offer(queue.peek().right);
                intList.add(queue.poll().val);
            }
            list.add(intList);
        }
        return list;
    }
}

//Line 12: error: Queue is abstract; cannot be instantiated, use LinkedList