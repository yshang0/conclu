//67_Binary_Tree_Inorder_Traversal


List<Integer> result = new ArrayList<>();
public List<Integer> inorderTraversal(TreeNode root) {
    helper(root);
    return result;
}
public void helper(TreeNode root) {
    if(root == null) {
        return;
    }
    
    helper(root.left);
    result.add(root.val);
    helper(root.right);
}