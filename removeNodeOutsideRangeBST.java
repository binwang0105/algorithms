public TreeNode removeOutsideRange(TreeNode root, int min, int max){
	if(root == null){ return root;}

	root.left = removeOutsideRange(root.left, min, max);
	root.right = removeOutsideRange(root.right, min, max);

	if(root.val < min){
		TreeNode rnode = root.right;
		delete root;
		return rnode;
	}

	if(root.val > max){
		TreeNode lnode = root.left;
		delete root;
		return lnode;
	}
	return root;
}