//66_Binary_Tree_Preorder_Traversal

public List<Integer> preorderTraversal(TreeNode root) {
    List<Integer> result = new ArrayList<>();
    
    helper(root, result);
    return result;
}
public void helper (TreeNode root, List<Integer> result) {
    if(root == null) {
        return;
    }
    result.add(root.val);
    helper(root.left, result);
    helper(root.right, result);
}
//time :O(n), n: nodes;
//space : O(n), n: nodes;