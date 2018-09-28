//11_Search_Range_in_Binary_Search_Tree

List<Integer> result = new ArrayList<>();
public List<Integer> searchRange(TreeNode root, int k1, int k2) {
    helper(root, k1, k2);
    return result;
}

public void helper (TreeNode root, int k1, int k2) {
    if (root == null) {
        return;
    }
    
    if (root.val >= k1 && root.val <= k2) {
        result.add(root.val);
        helper(root.left, k1, k2);
        helper(root.right, k1, k2);
    }
    if (root.val < k1) {
        helper(root.right, k1, k2);
    }
    if (root.val > k2) {
        helper(root.left, k1, k2);
    }
}

 //time :O(nodes);
//space:O(nodes);

public List<Integer> searchRange(TreeNode root, int k1, int k2) {
    List<Integer> result = new ArrayList<>();

    if(root == null) {
        return result;
    }

    if(root.val > k2) {
        return searchRange(root.left, k1, k2);
    }
    if(root.val < k1) {
        return searchRange(root.right, k1, k2); 
    }

    result.addAll(searchRange(root.left, k1, k2));
    result.add(root.val);
    result.addAll(searchRange(root.right, k1, k2));
    return result;
}