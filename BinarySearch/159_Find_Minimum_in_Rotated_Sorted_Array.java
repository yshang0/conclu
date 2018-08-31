//159_Find_Minimum_in_Rotated_Sorted_Array

public class Solution {
    /**
     * @param nums: a rotated sorted array
     * @return: the minimum number in the array
     */
    public int findMin(int[] nums) {
        if(nums == null || nums.length == 0) {
            return 0;
        }
        int start = 0, end = nums.length - 1;
        while(start + 1 < end) {
            int mid = start + (end - start) / 2;
            if(nums[mid] > nums[0]) {
                start = mid;
            }
            if(nums[mid] < nums[0]) {
                end = mid;
            }
        }
        if(nums[end] < nums[start]) {
            return nums[end];
        }
        if(nums[start] < nums[end]) {
            return nums[0];
        }
        return -1;
    }

    public int findMin(int[] nums) {
        // write your code here
        if(nums == null || nums.length == 0){
            return -1;
        }
        
        
        int start = 0, end = nums.length - 1;
        int target = nums[end];  // here is the different;
        
        while(start + 1 < end){
            int mid = start + (end - start) / 2;
            
            if(nums[mid] > target){
                start = mid;
            } else {
                end = mid;
            }
        }
        
        if(nums[start] < target){
            return nums[start];
        }
        
        return nums[end];
    }
}