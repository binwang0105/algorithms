public class Solution {
    public int longestConsecutive(TreeNode root) {
        if(root == null){
            return 0;
        }
        return findLongest(root, 0, root.val - 1);
    }
    
    private int findLongest(TreeNode root, int length, int preVal){
        if(root == null){
            return length;
        }
        // �жϵ�ǰ�Ƿ�����
        int currLen = preVal + 1 == root.val ? length + 1 : 1;
        // ���ص�ǰ���ȣ����������ȣ��������������нϴ���Ǹ�
        return Math.max(currLen, Math.max(findLongest(root.left, currLen, root.val), findLongest(root.right, currLen, root.val)));  
    }
}