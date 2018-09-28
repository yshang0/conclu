//633_Find_the_Duplicate_Number

public int findDuplicate(int[] nums) {
    int fast = nums[nums[0]];
    int slow = nums[0];
    
    while(slow != fast) {
        slow = nums[slow];
        fast = nums[nums[fast]];
    } //O(N)
    
    fast = 0;
    while(slow != fast) {
        fast = nums[fast];
        slow = nums[slow];
    } //O(N)
    return slow;
}
// Time: O(N);  N = nums.length;
// Space: O(1);

public int findDuplicate(int[] nums) {
    
    int l = 1;
    int r = nums.length - 1;  // n
    
    while (l + 1 < r) {  // Time:O(logN);  N : nums.length;
        int mid = l + (r - l) / 2;
        if (count(nums, mid) <= mid) {
            l = mid;
        } else {
            r = mid;
        }
    }
    
    if (count(nums, l) <= l) {
        return r;
    }
    return l;
}

private int count(int[] nums, int mid) {
    int cnt = 0;
    for (int item : nums) {
        if (item <= mid) {
            cnt++;
        }
    }
    return cnt;
    // Time: O(N);
}

//Time: O(N * logN);
//Space: O(1);