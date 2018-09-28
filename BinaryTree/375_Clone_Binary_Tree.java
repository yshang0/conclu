//375_Clone_Binary_Tree

public TreeNode cloneTree(TreeNode root) {
    if (root == null) {
        return null;
    }
    
    TreeNode newnode = new TreeNode(root.val);
    newnode.left = cloneTree(root.left);
    newnode.right = cloneTree(root.right);
    return newnode;
    
}

//Time : O(n), n: nodes;
//space: O(n), n: nodes;