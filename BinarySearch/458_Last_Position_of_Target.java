//458_Last_Position_of_Target
public class Solution {
    /**
     * @param nums: An integer array sorted in ascending order
     * @param target: An integer
     * @return: An integer
     */
    public int lastPosition(int[] nums, int target) {
        if(nums == null || nums.length == 0) {
            return -1;
        }
        int start = 0, end = nums.length - 1;
        while(start + 1 < end) {
            int mid = start + (end - start) / 2;
            if(nums[mid] <= target) {   // need to move start position when the nums[mid] == target;
                start = mid;
            }
            if(nums[mid] > target) {
                end = mid;
            }
        }
        if(nums[end] == target) {
            return end;					// need to check end firstly since require the last postion;
        }
        if(nums[start] == target) {
            return start;
        }
        
        return -1;
    }
}