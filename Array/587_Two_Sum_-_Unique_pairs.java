//587_Two_Sum_-_Unique_pairs

public int twoSum6(int[] nums, int target) {
    int count = 0;
    Arrays.sort(nums);
    
    int l = 0;
    int r = nums.length - 1;
    while (l < r) {
        
        if (nums[l] + nums[r] < target) {
            l++;
            while (l < r && nums[l] == nums[l - 1]) {
                l++;
            }
            continue;
        }
        if (nums[l] + nums[r] > target) {
            r--;
            while (l < r && nums[r] == nums[r + 1]) {
                r--;
            }
            continue;
        }
        if (nums[l] + nums[r] == target) {
            count++;
            l++;
            r--;
            while (l < r && nums[l] == nums[l - 1]) {
                l++;
            }
            while (l < r && nums[r] == nums[r + 1]) {
                r--;
            }
            continue;
        }
    }
    return count;

        //time:O(nlogn);
        //space:O(1)
}


public int twoSum6(int[] nums, int target) {
    if(nums == null || nums.length < 2) {
        return 0;
    }
    int ans = 0;
    int l = 0, r = nums.length - 1;
    Arrays.sort(nums);
    while(l < r) {
        while(l < r && nums[l] + nums[r] < target) {
            l++;
        }
        if(l < r && nums[l] + nums[r] == target) {
            ans++;
            while(l < r && nums[r] == nums[r - 1]) {
                r--;
            }
        }
        r--;
    }
    return ans;
}