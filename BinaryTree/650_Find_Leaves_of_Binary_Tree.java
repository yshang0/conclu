//650_Find_Leaves_of_Binary_Tree

public List<List<Integer>> findLeaves(TreeNode root) {
        
    List<List<Integer>> ans = new ArrayList<>();
    
    Map<Integer, List<Integer>> result = new HashMap<>();
    int max_depth = dfs(root, result);
    
    for(int i = 1; i <= max_depth; i++){
        ans.add(result.get(i));
    }
    return ans;
}

private int dfs(TreeNode root, Map<Integer, List<Integer>> result){
    if(root == null){
        return 0;
    }
    
    int depth = Math.max(dfs(root.left, result), dfs(root.right, result)) + 1;
    
    result.putIfAbsent(depth, new ArrayList<>());
    result.get(depth).add(root.val);
    
    return depth;
}
//time O(nodes);
//space O(nodes);