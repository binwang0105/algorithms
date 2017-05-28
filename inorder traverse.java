public List<Integer> inorderTraverse(TreeNode root){
	List<Integer> res = new LinkedList<Integer>();
	Stack<TreeNode> stack = new Stack<TreeNode>();
	TreeNode cur = root;
	while(cur != null || !stack.isEmpty()){
		while(cur != null){
			stack.push(cur);
			cur = cur.left;
		}
		TreeNode node = stack.pop();
		res.add(node.val);
		cur = node.right;
	}
	return res;
}