//39_Recover_Rotated_Sorted_Array

public void recoverRotatedSortedArray(List<Integer> nums) {
    if (nums == null || nums.size() == 0 || nums.size() == 1) {
        return;
    }
    
    int idx = Integer.MAX_VALUE;
    
    for (int i = 0; i < nums.size() - 1; i++) {
        if (nums.get (i) > nums.get(i + 1)) {
            idx = i;
        }
    }
    
    if (idx == Integer.MAX_VALUE) {
        return;
    } else {
        for (int j = 0; j <= idx; j++) {
            int temp = nums.remove(0);
            nums.add(temp);
        }
    }
    //time:O(n);
    //space:O(1);
}

public void recoverRotatedSortedArray(List<Integer> nums) {
    for(int i = 0; i < nums.size() - 1; i++) {
        if(nums.get(i) > nums.get(i + 1)) {
            reverse(nums, 0, i);
            reverse(nums, i + 1, nums.size() - 1);
            reverse(nums, 0, nums.size() - 1);
            break;
        }
        //先转左边，再转右边，再整体转一下。
    }
}
private void reverse(List<Integer> nums, int st, int ed) {
    int l = st, r = ed;
    while(l < r) {
        int temp = nums.get(l);
        nums.set(l, nums.get(r));
        nums.set(r, temp);
        l++;
        r--;
    }
}

