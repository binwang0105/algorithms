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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> list = new ArrayList<String>();
        if(root != null)
            searchBT(root, "", list);
        return list;
    }
    
     public void searchBT(TreeNode root, String path, List<String> list){
        if(root.left == null && root.right == null)
            list.add(path + root.val);
        if(root.left != null)
            searchBT(root.left, path + root.val + "->", list);
        if(root.right != null)
            searchBT(root.right, path + root.val + "->", list);
    }
}

/*
* 1. 注意DFS的顺序，如果不为空就一直访问孩子，对于二叉树先左后右
* 2. DFS本质在于递归，所以应该是一个函数调用另一个函数
* 3. 如何判断一个节点是叶子？root.left == null, root.right == null;
*/