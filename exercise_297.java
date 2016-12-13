public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        stack.push(root);

        while(!stack.isEmpty()){
            TreeNode node = stack.pop();
            if(node == null){
                sb.append("#").append(" ");
                continue;
            }

            sb.append(node.val).append(" ");
            stack.push(node.right);
            stack.push(node.left);
        }
        return sb.toString().trim();
    }   //按照dfs序列化，也可以按照bfs去序列化

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        Stack<TreeNode> stack = new Stack<>(); //used to simulate dfs
        String[] strs = data.split(" ");
        if(strs[0].equals("#")) return null; //the tree is not valid
        
        TreeNode root = new TreeNode(Integer.parseInt(strs[0]));
        stack.push(root);
        boolean doLeft = true;
        int index = 1;
        
        while(index < strs.length){
            String str = strs[index++];
            TreeNode node = (str.equals("#")) ? null: new TreeNode(Integer.parseInt(str));
            if(doLeft){
                stack.peek().left = node;
                if(node == null)
                    doLeft = false;
            } else {
                stack.pop().right = node;
                if(node != null)
                    doLeft = true;
            }
            if(node != null) stack.push(node);
        }
        return root;
    }
}