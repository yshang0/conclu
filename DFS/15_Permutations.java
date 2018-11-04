//15_Permutations

public List<List<Integer>> permute(int[] nums) {
    boolean[] done = new boolean[nums.length];
    List<List<Integer>> result = new ArrayList<>();
    helper(nums, 0, done, result, new ArrayList<>());
    return result;
}
public void helper (int[] nums, int length, boolean[] done, List<List<Integer>> result, List<Integer> cur) {
    if (length == nums.length) {
        result.add (new ArrayList<>(cur));
        return;
    }
    
    for (int i = 0; i < nums.length; i++) {
        if (!done[i]) {
            cur.add(nums[i]);
            done[i] = true;
            helper (nums, length + 1, done, result, cur);
            cur.remove(cur.size() - 1);
            done[i] = false;
        }
    }
}
time:O(2^n)