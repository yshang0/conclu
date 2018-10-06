//726_Check_Full_Binary_Tree

public boolean isFullTree(TreeNode root) {
    if (root == null) {
        return true;
    }
    Queue<TreeNode> queue = new LinkedList<>();
    queue.add(root);
    while (queue.size() > 0) {
        TreeNode cur = queue.poll();
        if (cur.left != null && cur.right != null) {
            queue.add(cur.left);
            queue.add(cur.right);
            continue;
        }
        if (cur.left == null && cur.right == null) {
            continue;
        }
        return false;
    }
    return true;
}
    //time:O(n);
    //space:O(maximum level container);