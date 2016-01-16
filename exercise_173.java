public class BSTIterator {
    
    Stack<TreeNode> stk;
    
    public BSTIterator(TreeNode root) {
        stk = new Stack<TreeNode>();
        while(root != null){
            stk.push(root);
            root = root.left;
        }
    }

    /** @return whether we have a next smallest number */
    public boolean hasNext() {
        return !stk.isEmpty();
    }

    /** @return the next smallest number */
    public int next() {
        TreeNode curr = stk.pop();
        int ret = curr.val;
        if(curr.right != null){
            curr = curr.right;
            while(curr != null){    
                stk.push(curr);
                curr = curr.left;
            }
        }
        return ret;
    }
}