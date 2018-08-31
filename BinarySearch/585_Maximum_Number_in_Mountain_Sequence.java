//585_Maximum_Number_in_Mountain_Sequence



public class Solution {
    /**
     * @param nums: a mountain sequence which increase firstly and then decrease
     * @return: then mountain top
     */
    public int mountainSequence(int[] nums) {
        if(nums == null || nums.length == 0) {
            return 0;
        }
        
        int start = 0, end = nums.length - 1;
        while(start + 1 < end) {
            int mid = start + (end - start) / 2;
            while(nums[mid] == nums[mid - 1]) {
                mid = mid - 1; 
            }
            if(nums[mid] > nums[mid - 1]) {
                start = mid;
            }
            if(nums[mid] < nums[mid - 1]) {
                end = mid;
            }
        }
        
        if(nums[start] >= nums[end]) {
            return nums[start];
        } 
        return nums[end];
    }

    public int mountainSequence(int[] nums) {
        // write your code here
        if(nums == null || nums.length == 0){
            return 0;
        }
        
        int start = 0, end = nums.length - 1;
        
        while (start + 1 < end){
            int mid = start + (end - start) / 2;
            
            if(nums[mid] > nums[mid + 1]){
                end = mid;
            } else {
                start = mid;
            }
            
        }
        
        return Math.max(nums[start], nums[end]); // yes, it is better;
    }
}