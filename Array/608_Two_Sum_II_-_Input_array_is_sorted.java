//608_Two_Sum_II_-_Input_array_is_sorted

public int[] twoSum(int[] nums, int target) {
    int l = 0;
    int r = nums.length - 1;
    
    while (l < r) {
        if (nums[l] + nums[r] < target) {
            l++;
        }
        if (nums[l] + nums[r] > target) {
            r--;
        }
        if (nums[l] + nums[r] == target) {
            return new int[] {++l, ++r};
        }
    }
    return new int[2];
}
//time:O(n);
//space:O(1);

public int[] twoSum(int[] nums, int target) {
    if(nums == null || nums.length < 2) {
        return new int[0];
    }
    
    for(int l = 0, r = nums.length - 1; l < r; r--) {
        while(l < r && nums[l] + nums[r] < target) {
            l++;
        }
        if(l < r && nums[l] + nums[r] == target) {
            return new int[]{l + 1, r + 1};
        }
    }
    return new int[0];
}