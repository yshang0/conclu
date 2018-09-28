//475_Binary_Tree_Maximum_Path_Sum_II

int m = Integer.MIN_VALUE; 
public int maxPathSum2(TreeNode root) {
    if (root == null) {
        return 0;
    }
    helper(root, 0);
    return m;
}

public void helper (TreeNode root, int val) {
    if (root == null) {
        return;
    }
    
    m = Math.max(val + root.val, m);
    
    helper (root.left, val + root.val);
    helper (root.right, val + root.val);
}
//time :O(nodes);
//space:O(1);

public int maxPathSum2(TreeNode root) {
	if (root == null) {
		return 0;
	}

	int left = maxPathSum2(root.left);
	int right = maxPathSum2(root.right);
	return root.val + Math.max(Math.max(left, right), 0);
}