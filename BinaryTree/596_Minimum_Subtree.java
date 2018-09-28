//596_Minimum_Subtree


TreeNode result = new TreeNode(0);
    int min = Integer.MAX_VALUE;
    public TreeNode findSubtree(TreeNode root) {
        if (root == null) {
            return root;
        }
        helper (root);
        return result;
        
    }
    
public int helper (TreeNode root) {
    if(root.left == null && root.right == null) {
        if (root.val < min) {
            result = root;
            min = root.val;
            
        }
        return root.val;
    }
    
    int left = 0, right = 0;
    if (root.left != null) {
        left = helper (root.left);
    }
    if(root.right != null) {
        right = helper (root.right);
    }
    if(left + right + root.val < min) {
        result = root;
        min = left + right + root.val;
        
    }
    return left + right + root.val;
}
//time : O(nodes);
//space :O(1);