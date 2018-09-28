//661_Convert_BST_to_Greater_Tree

int sum = 0;
public TreeNode convertBST(TreeNode root) {
    // write your code here
    findSum(root);
    return root;
}
private void findSum(TreeNode root){
    if(root == null){
        return;
    }
    findSum(root.right);
    sum = sum + root.val;
    root.val = sum;
    findSum(root.left);
}
//Time: O(n); n=nodes;
//space:O(1);