//57_3Sum


public List<List<Integer>> threeSum(int[] numbers) {
    Arrays.sort(numbers);

    
    List<List<Integer>> result = new ArrayList<>();
    if (numbers == null || numbers.length < 3 || numbers[0] > 0) {
        return result;
    }
    for (int i = numbers.length - 1; i >= 2; i--) {
        if (i < numbers.length - 1 && numbers[i] == numbers[i + 1]) {
            continue;
        }
        int target = (-1) * numbers[i];
        int l = 0;
        int r = i - 1;
        while (l < r) {
            while (l < r && numbers[l] + numbers[r] < target) {
                l++;
            }
            if (l < r && numbers[l] + numbers[r] == target) {
                List<Integer> cur = new ArrayList<>();
                cur.add(numbers[l]);
                cur.add(numbers[r]);
                cur.add(numbers[i]);
                result.add(cur);
                while (l < r && numbers[r] == numbers[r - 1]) {
                    r--;
                }
            }
            
            r--;
        }
    }
    return result;
}

//time:O(n^2);
//space:O(result);