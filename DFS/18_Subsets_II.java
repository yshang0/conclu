//18_Subsets_II

public List<List<Integer>> subsetsWithDup(int[] nums) {
    List<List<Integer>> result = new ArrayList<>();
    if (nums == null) {
        return result;
    }
    Arrays.sort(nums);
    helper (nums, result, 0, new ArrayList<>());
    return result;
}
public void helper (int[] nums, List<List<Integer>> result, int index, List<Integer> cur) {
    result.add(new ArrayList<>(cur));
    
    for (int i = index; i < nums.length; i++) {
        if (i > index && nums[i] == nums[i - 1]) {
            continue;
        }
        cur.add (nums[i]);
        helper (nums, result, i + 1, cur);
        cur.remove (cur.size() - 1);
    }
    
}
//time:O(n * 2^n);
//space:O(2^n);