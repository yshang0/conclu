//1165_Subtree_of_Another_Tree


public boolean isSubtree(TreeNode s, TreeNode t) {
        
    if (s == null) {
        return t == null;
    }
    
    if (s.val == t.val && helper (s.left, t.left) && helper (s.right, t.right)) {
        return true;
    }
    return isSubtree(s.left, t) ||isSubtree(s.right, t);
    
} 
public boolean helper(TreeNode s, TreeNode t) {
    if (s == null) {
        return t == null;
    }
    if (t == null) {
        return false;
    }
    
    if (s.val == t.val) {
        return helper (s.left, t.left) && helper (s.right, t.right);
    } 
    return false;
    
}
//time :O(n * m);
//space O(1);