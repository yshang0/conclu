//376_Binary_Tree_Path_Sum

List<List<Integer>> result = new ArrayList<>();
public List<List<Integer>> binaryTreePathSum(TreeNode root, int target) {
    List<Integer> path = new ArrayList<>();
    helper(root, target, path);
    return result;
}
public void helper(TreeNode root, int target, List<Integer> path) {
    if(root == null) {
        return;
    }
    
    path.add(root.val);
    target -= root.val;
    if(root.left == null && root.right == null && target == 0) {
        result.add(new ArrayList<>(path));
    }
    
    helper(root.right, target, path);
    helper(root.left, target, path);
    path.remove(path.size() - 1);
}