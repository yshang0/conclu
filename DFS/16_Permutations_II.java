//16_Permutations_II

public List<List<Integer>> permuteUnique(int[] nums) {
    List<List<Integer>> result = new ArrayList<>();
    boolean[] done = new boolean[nums.length];
    Arrays.sort(nums);
    helper (done, 0, nums, result, new ArrayList<>());
    return result;
}
public void helper (boolean[] done, int length, int[] nums, List<List<Integer>> result, List<Integer> cur) {
    if (length == nums.length) {
        result.add(new ArrayList<>(cur));
        return;
    }
    
    for (int i = 0; i < nums.length; i++) {
        if(i > 0 && nums[i] == nums[i - 1] && !done[i - 1]) {
            continue;
        }
        if (!done[i]) {
            cur.add(nums[i]);
            done[i] = true;
            helper (done, length + 1, nums, result, cur);
            cur.remove(cur.size() - 1);
            done[i] = false;
        }
    }
}