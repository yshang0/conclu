//481_Binary_Tree_Leaf_Sum

public int leafSum(TreeNode root) {
    if (root == null) {
        return 0;
    }
    if (root.left == null && root.right == null){
        return root.val;
    }
    return leafSum(root.left) + leafSum(root.right);
    
}
//Time: O(n), n: level of tree;