//604_Window_Sum

public int[] winSum(int[] nums, int k) {
    if (nums == null || nums.length == 0 || k == 0) {
        return new int[0];
    }
    int[] result = new int[nums.length - k + 1];
    int cur_sum = 0;
    
    for(int i = 0; i < k; i++) {
        cur_sum += nums[i];
    }
    
    int idx = k - 1;
    while (idx < nums.length - 1) {
        result[idx - k + 1] = cur_sum;
        cur_sum = cur_sum - nums[idx - k + 1] + nums[idx + 1];
        idx++;
    }
    result[nums.length - k] = cur_sum;
    return result;
}

//time :O(n);
//space :O(n);