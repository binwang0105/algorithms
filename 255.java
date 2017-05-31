public class Solution {
    public boolean verifyPreorder(int[] preorder) {
        return helper(preorder, 0, preorder.length - 1);
    }

    private boolean helper(int[] preorder, int start, int end){
        if(end - start <= 1) return true;

        int breakPoint = start + 1;
        int root = preorder[start];

        // breakPoint should stop at index of first element > root
        // if no left subtree, breakPoint stops at start;
        for(int i = start + 1; i <= end; i++){
            if(preorder[i] < root) breakPoint ++;
            else break;
        }

        for(int i = breakPoint; i <= end; i++){
            if(preorder[i] < root) return false;
        }

        return helper(preorder, start + 1, breakPoint - 1) 
               && helper(preorder, breakPoint, end);
    }
}
