public class Solution {
/**
 * @param p is temp variable used to traverse tree 
 * 
 */
    public int kthSmallest(TreeNode root, int k) {
        
        //in-order traversal we need a stack
        Stack<TreeNode> stk = new Stack<TreeNode>();
        int cnt = 0;
        
        TreeNode p = root;
        while(p != null){
            stk.push(p);
            p = p.left;
        }
        
        while(!stk.isEmpty()){
            TreeNode temp = stk.pop();
            cnt++;
            if(cnt == k){
                return temp.val;
            }
            if(temp.right != null){
                temp = temp.right;
                
                while(temp != null){
                    stk.push(temp);
                    temp = temp.left;
                }
            }
        }        
        return 0;
    }
}