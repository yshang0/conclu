//406_Minimum_Size_Subarray_Sum

public int minimumSize(int[] nums, int s) {
    int length = Integer.MAX_VALUE;
    
    int sum = 0;
    
    for (int l = 0, r = 0; r < nums.length; r++) {
        sum += nums[r];
        
        while (sum >= s) {
            length = Math.min(length, r - l + 1);
            sum -= nums[l++];
        }
    }
    return length == Integer.MAX_VALUE ? -1 : length;
    
    
}
//time:O(n);
//space:O(1);