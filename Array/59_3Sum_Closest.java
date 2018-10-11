//59_3Sum_Closest

public int threeSumClosest(int[] numbers, int target) {
        
    if (numbers== null || numbers.length < 3) {
        return -1;
    }
    
    Arrays.sort(numbers);
    
    int bestsum = numbers[0] + numbers[1] + numbers[2];
    
    
    
    for (int first = 0; first < numbers.length - 2; first++) {
        int left = first + 1, right = numbers.length - 1;
        while (left < right) {
            int sum = numbers[first] + numbers[left] + numbers[right];
            if (Math.abs(target - sum) < Math.abs(target - bestsum)) {
                bestsum = sum;
            }
            if (sum > target) {
                right--;
            } else {
                left++;
            }
        }
    }
    return bestsum;
}
//time:O(n ^ 2);
//space:O(1)