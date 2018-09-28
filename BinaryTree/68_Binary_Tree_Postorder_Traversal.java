//68_Binary_Tree_Postorder_Traversal

public List<Integer> postorderTraversal(TreeNode root) {
    List<Integer> result = new ArrayList<>();
    helper(root, result);
    return result;
}
public void helper(TreeNode root, List<Integer> result) {
    if(root == null) {
        return;
    }
    
    helper(root.left, result);
    helper(root.right, result);
    result.add(root.val);
}
//Time: O(n), n:nodes;
//space: O(n), n:nodes;