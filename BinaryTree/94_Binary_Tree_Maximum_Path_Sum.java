//94_Binary_Tree_Maximum_Path_Sum

class Result {
    int single;
    int max;
    Result (int single, int max) {
        this.single = single;
        this.max = max;
    }
} 
public int maxPathSum(TreeNode root) {
    if (root == null) {
        return 0;
    }
    
    Result res = helper (root);
    return res.max;
}

public Result helper (TreeNode root) {
    if (root == null) {
        return new Result (0, Integer.MIN_VALUE);
    }
    
    Result left = helper (root.left);
    Result right = helper (root.right);
    
    int single = root.val + Math.max(Math.max(left.single, right.single), 0);
    
    int max = Math.max(left.max, right.max);
    
    int maxRoot = Math.max(left.single + right.single + root.val, single);
    
    max = Math.max(maxRoot, max);
    
    return new Result(single, max);
    
}

//time:O(nodes);
//space:O(1);