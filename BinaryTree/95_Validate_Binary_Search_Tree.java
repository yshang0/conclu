//95_Validate_Binary_Search_Tree

public boolean isValidBST(TreeNode root) {
    long max = Long.MAX_VALUE;
    long min = Long.MIN_VALUE;
    
    return helper(root, max, min);
    
}

public boolean helper(TreeNode root, long max, long min) {
    if(root == null) {
        return true;
    }
    if(root.val >= max || root.val <= min) {
        return false;
    }
    boolean left = helper(root.left, Math.min(max, root.val), min);
    boolean right = helper(root.right, max, Math.max(min, root.val));
    return left && right;
}
//Time: O(n), n: nodes;
//Space: O(1);