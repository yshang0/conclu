//578_Lowest_Common_Ancestor_III


class Result {
    boolean findA;
    boolean findB;
    TreeNode node;
    Result (boolean findA, boolean findB, TreeNode node) {
        this.findA = findA;
        this.findB = findB;
        this.node = node;
    }
} 
public TreeNode lowestCommonAncestor3(TreeNode root, TreeNode A, TreeNode B) {
    
    Result res = helper (A, B, root);
    if(res.findA && res.findB) {
        return res.node;
    }
    return null;
    
}
public Result helper (TreeNode A, TreeNode B, TreeNode root) {
    if(root == null) {
        return new Result(false, false, null);
    }
    
    
    Result left = helper(A, B, root.left);
    Result right = helper(A, B, root.right);
    
    boolean root_findA = left.findA || right.findA || root == A;
    boolean root_findB = left.findB || right.findB || root == B;
    
    TreeNode cur_node = null;
    if(root == A || root == B) {
        cur_node = root; 
    } else if (left.node != null && right.node != null) {
        cur_node = root;
    } else if (left.node != null) {
        cur_node = left.node;
    } else if (right.node != null) {
        cur_node = right.node;
    }
    
    return new Result(root_findA, root_findB, cur_node);
} 
//time:O(nodes);
//space:O(1);