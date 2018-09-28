//448_Inorder_Successor_in_BST

public TreeNode inorderSuccessor(TreeNode root, TreeNode p) {
    if (root == null || p == null) {
        return null;
    }
    
    if (p.val >= root.val) {
        return inorderSuccessor(root.right, p);
    } 
    if (p.val < root.val) {
        TreeNode left = inorderSuccessor(root.left, p);
        if(left == null) {
            return root;
        } else {
            return left;
        }
    }
    return null;
    //time: O(level);
    //space:O(1);
}