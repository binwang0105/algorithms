public class Solution {
    public int closestValue(TreeNode root, double target) {
        
        //direction, lead us closer to our answer
        TreeNode kid = target < root.val ? root.left : root.right;
        
        //only root
        if(kid == null) 
            return root.val;
        
        int closet = closestValue(kid, target);
        
        return Math.abs(root.val - target) < Math.abs(closet - target)?root.val:closet;
    }
}