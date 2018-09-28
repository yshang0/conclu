//100_Remove_Duplicates_from_Sorted_Array


public int removeDuplicates(int[] nums) {
    if (nums == null || nums.length == 0) {
        return 0;
    }
    int idx = 1;
    int cur_idx = 1;
    int cur = nums[0];
    while (idx < nums.length) {
        if (nums[idx] != cur) {
            cur = nums[idx];
            nums[cur_idx++] = nums[idx++];
        } else {
            idx++;
        }
    }
    return cur_idx;
    //time:O(n);
    //sapce:O(1);
}