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
*********************************************************************************
List<List<Integer>> result = new ArrayList<>();
public List<List<Integer>> binaryTreePathSum(TreeNode root, int target) {
    if(root == null) {
        return result;
    }
    List<Integer> path = new ArrayList<>();
    helper(root, target, 0, path);
    return result;
}

public void helper(TreeNode root, int target, int cur, List<Integer> path) {
    
    path.add(root.val);
    if(root.left == null && root.right == null) {
        if((cur + root.val) == target) {
            result.add(new ArrayList<Integer>(path));
            path.remove(path.size() - 1);
            return;
        }
    }
    
    if(root.left != null) {
        helper(root.left, target, cur + root.val, path);
    }
    if(root.right != null) {
        helper(root.right, target, cur + root.val, path);
    }
    path.remove(path.size() - 1);
}
//time: O(N), N = number of node
//space :O(leaf * level);