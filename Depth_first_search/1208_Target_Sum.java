//1208_Target_Sum

//depth first search
int result = 0; 
public int findTargetSumWays(int[] nums, int s) {
    if(nums == null || nums.length == 0) {
        return 0;
    }
    helper(0, nums, 0, s);
    return result;
}

public void helper(int index, int[] nums, int cur, int s) {
    if(index >= nums.length) {
        if(cur == s) {
            result++;
        }
    } else {
        helper(index + 1, nums, cur + nums[index], s);
        helper(index + 1, nums, cur - nums[index], s);
    }
    
}

Time : O(2^n)   n = nums.length;
space: O(1)