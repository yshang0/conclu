//1181_Diameter_of_Binary_Tree

class Result {
    int single;
    int max;
    Result (int single, int max) {
        this.single = single;
        this.max = max;
    }
}
public int diameterOfBinaryTree(TreeNode root) {
    if(root == null) {
        return 0;
    }
    Result result = helper (root);
    return result.max - 1;
}
public Result helper (TreeNode root) {
    if (root == null) {
        return new Result(0, 0);
    }

    Result left = helper (root.left);
    Result right = helper (root.right);

    int single = Math.max(left.single, right.single) + 1;

    int max = Math.max(Math.max(left.max, right.max), (left.single + right.single + 1));

    return new Result(single, max);
}

//time :O(nodes);
//space:O(1);