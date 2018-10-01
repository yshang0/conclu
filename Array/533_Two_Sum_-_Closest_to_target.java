//533_Two_Sum_-_Closest_to_target

public int twoSumClosest(int[] nums, int target) {
    Arrays.sort(nums);
    int ans = Integer.MAX_VALUE;
    
    int l = 0;
    int r = nums.length - 1;
    
    while (l < r) {
        while (l < r && nums[r] + nums[l] > target) {
            ans = Math.min(ans, -target + nums[r] + nums[l]);
            r--;
        }
        if (l < r && nums[r] + nums[l] == target) {
            return 0;
        }
        while (l < r && nums[r] + nums[l] < target) {
            ans = Math.min(ans, target - nums[r] - nums[l]);
            l++;
        }
    }
    return ans;
}
//time:O(nlogn);
//space:O(1);