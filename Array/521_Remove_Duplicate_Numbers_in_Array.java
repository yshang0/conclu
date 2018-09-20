//521_Remove_Duplicate_Numbers_in_Array

public int deduplication(int[] nums) {
    if(nums.length == 0 || nums.length == 1) {
        return nums.length;
    }
    HashSet<Integer> record = new HashSet<>();
    int count = 0;
    
    for(int i = 0; i < nums.length; i++) {
        if (!record.contains(nums[i])) {
            record.add(nums[i]);
            nums[count] = nums[i];
            count++;
        }
    }
    return count;
}

public int deduplication(int[] nums) {
    if(nums.length == 0 || nums == null){
        return 0;
    }
    Arrays.sort(nums);
    int index = 0;
    for(int i = 0; i < nums.length; i++) {
        if(nums[index] != nums[i]) {
            
            index++;
            nums[index] = nums[i];
            
        }
    }
    return index + 1;
}