//767_Reverse_Array
public class Solution {
    /**
     * @param nums: a integer array
     * @return: nothing
     */
    public void reverseArray(int[] nums) {
    	int n = nums.length;

    	int i = 0, j = n - 1;
    	while(i < j) {
    		int temp = nums[i];
    		nums[i] = nums[j];
    		nums[j] = temp;
    		i++;
    		j--;
    	}
    }
}