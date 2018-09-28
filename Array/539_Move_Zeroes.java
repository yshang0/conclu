//539_Move_Zeroes


public void moveZeroes(int[] nums) {
    int idx = 0;
    for (int i = 0; i < nums.length; i++) {
        if (nums[i] == 0) {
            continue;
        } else {
            nums[idx] = nums[i];
            idx++;
        }
    }
    while(idx != nums.length) {
        nums[idx] = 0;
        idx++;
    }
}

//time:O(n);
//space:O(0);