//88_Lowest_Common_Ancestor_of_a_Binary_Tree


public TreeNode lowestCommonAncestor(TreeNode root, TreeNode A, TreeNode B) {
    if (root == null || root == A || root == B) {
        return root;
    }
    
    TreeNode left = lowestCommonAncestor (root.left, A, B);
    TreeNode right = lowestCommonAncestor (root.left, A, B);
    
    if (left != null && right != null) {
        return root;
    } 
    if (left != null) {
        return left;
    }
    if (right != null) {
        return right;
    }
    return null;

}
//time : O(N), N : entries;
//space: O(1);