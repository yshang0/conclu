//71_Binary_Tree_Zigzag_Level_Order_Traversal

public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
    int direction = 1;
    Stack<TreeNode> s1 = new Stack<>();
    Stack<TreeNode> s2 = new Stack<>();
    List<List<Integer>> result = new ArrayList<>();
    if (root == null) {
        return result;
    }
    
    s1.push(root);
    
    while (!s1.isEmpty() || !s2.isEmpty()) {
        List<Integer> level = new ArrayList<>();
        if (!s1.isEmpty()) {
            int size = s1.size();
            for (int i = 0; i < size; i++) {
                TreeNode cur = s1.pop();
                level.add(cur.val);
                if (cur.left != null) {
                    s2.push(cur.left);
                }
                if (cur.right != null) {
                    s2.push(cur.right);
                }
            }
        } else {
            int size = s2.size();
            for (int i = 0; i < size; i++) {
                TreeNode cur = s2.pop();
                level.add(cur.val);
                if (cur.right != null) {
                    s1.push(cur.right);
                }
                if (cur.left != null) {
                    s1.push(cur.left);
                }
            }
        }
        result.add(level);
    }
    return result;
    //time:O(n);
    //space:O(n);
}