//17_Subsets

public List<List<Integer>> subsets(int[] nums) {
    List<List<Integer>> result = new ArrayList<>();
    Arrays.sort(nums);
    helper(result, 0, nums, new ArrayList<>());
    return result;
}
public void helper (List<List<Integer>> result, int index, int[] nums, List<Integer> cur) {
    if (index == nums.length) {
        result.add(new ArrayList<>(cur));
        return;
    }
    
    cur.add(nums[index]);
    helper(result, index + 1, nums, cur);
    cur.remove(cur.size() - 1);
    helper(result, index + 1, nums, cur);
}
//time :O(2 ^ n);
//space:O(2 ^ n);