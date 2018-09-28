//175_Invert_Binary_Tree

public void invertBinaryTree(TreeNode root) {
    if (root == null) {
        return;
    }
    invertBinaryTree(root.left);
    invertBinaryTree(root.right);
    TreeNode temp = root.left;
    root.left = root.right;
    root.right = temp;
}
//time: O(N), N: nodes;
//space: no extra;