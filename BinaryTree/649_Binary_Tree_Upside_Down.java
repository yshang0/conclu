//649_Binary_Tree_Upside_Down

public TreeNode upsideDownBinaryTree(TreeNode root) {
    if (root == null) {
        return root;
    }
    TreeNode result = helper (root);
    return result;
}

public TreeNode helper (TreeNode root) {
    if (root.left == null) {
        return root;
    }
    
    TreeNode node = helper (root.left);
    root.left.left = root.right;
    root.left.right = root;
    root.left = null;
    root.right = null;
    return node;
    
}
//Time: O(level);
//space : O(level);