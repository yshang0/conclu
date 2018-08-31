//1132_Valid_Triangle_Number.java
public class Solution {
    /**
     * @param nums: the given array
     * @return:  the number of triplets chosen from the array that can make triangles
     */
   
    public int triangleNumber(int[] nums) {
        int count = 0;
    	Arrays.sort(nums);
    	int n = nums.length;
    	for(int i = 2; i < n; i++) {
    	    int left = 0, right = i - 1;
    	    while(left < right) {
    	        if(nums[left] + nums[right] > nums[i]) {
    	            count += right - left;
    	            right--;
    	        } else {
    	            left++;
    	        }
    	    }
    	}
    	return count;
    }
    // 1 2 3 4 5 6 7 8 
    // l   r i         => r - l = 2
    // 1 2 3 4 5 6 7 8 
    // l r   i         => r - l = 1
    // 1 2 3 4 5 6 7 8 
    // l     r i       => if !nums[left] + nums[right] > nums[i] => l++
    // 1 2 3 4 5 6 7 8 
    //   l   r i       => if !nums[left] + nums[right] > nums[i] => l++
    // 1 2 3 4 5 6 7 8 
    //     l r i       => 
}