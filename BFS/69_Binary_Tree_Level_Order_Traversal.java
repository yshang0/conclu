//69/70_Binary_Tree_Level_Order_Traversal

public List<List<Integer>> levelOrder(TreeNode root) {
    List<List<Integer>> result = new ArrayList<>();
    if (root == null) {
        return result;
    }
    Queue<TreeNode> queue = new LinkedList<>();
    queue.add(root);
    while (queue.size() != 0) {
        List<Integer> res = new ArrayList<>();
        int size = queue.size();
        for (int i = 0; i < size; i++) {
            TreeNode cur = queue.poll();
            if (cur.left != null) {
                queue.add(cur.left);
            }
            if (cur.right != null) {
                queue.add(cur.right);
            }
            res.add(cur.val);
        }
        result.add(res);
    }
    return result;
}
    //Time:O(n);
    //space:O(n);

public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (queue.size() != 0) {
            List<Integer> cur = new ArrayList<>();
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode p = queue.poll();
                cur.add(p.val);
                if (p.left != null) {
                    queue.add (p.left);
                }
                if (p.right != null) {
                    queue.add (p.right);
                }
            }
            result.add (cur);
        }
        Collections.reverse(result);
        return result;
    }