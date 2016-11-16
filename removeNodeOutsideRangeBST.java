public TreeNode removeOutsideRange(TreeNode root, int min, int max){
	if(root == null){ return root;}

	root.left = removeOutsideRange(root.left, min, max);
	root.right = removeOutsideRange(root.right, min, max);

	if(root.val < min){
		TreeNode node = root.right;
		delete root;
		return root;
	}

	if(root.val > max){
		TreeNode node = root.left;
		delete root;
		return root;
	}
	return root;
}