//148_Sort_Colors

public void sortColors(int[] nums) {
    helper (nums, 0);
    helper (nums, 1);
}

public void helper (int[] nums, int pivot) {
    
    int i = 0, j = nums.length - 1;
    
    while (i <= j) {
        while (i <= j && nums[i] <= pivot) {
            i++;
        }
        while (i <= j && nums[j] > pivot) {
            j--;
        }
        
        if (i <= j) {
            int a = nums[i];
            nums[i] = nums[j];
            nums[j] = a;
            i++;
            j--;
        }
    }
}

//time:O(nlogn) ~ O(n^2)
//space:O(logn) ~ O(n)