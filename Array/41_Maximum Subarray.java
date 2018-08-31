//41_Maximum Subarray
//optimize method O(N);
public class Solution {
    /**
     * @param nums: A list of integers
     * @return: A integer indicate the sum of max subarray
     */
    public int maxSubArray(int[] nums) {
        if(nums == null || nums.length == 0) {
            return 0;
        }
        int result = Integer.MIN_VALUE, subsum = 0, sum = 0;

        //subsum mean the minimum sum of before sum array;

        for(int i = 0; i < nums.length; i++) {
            sum += nums[i];
            result = Math.max(result, sum - subsum);
            subsum = Math.min(subsum, sum);
            
        }
        return result;
    }
}