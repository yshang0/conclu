//610_Two_Sum__Difference_equals_to_target

class Pair {
    int idx;
    int n;
    Pair(int idx, int n) {
        this.idx = idx;
        this.n = n;
    }
}
public int[] twoSum7(int[] nums, int target) {
    int[] result = new int[2];
    target = Math.abs(target);
    
    Pair[] pair = new Pair[nums.length];
    for (int i = 0; i < nums.length; i++) {
        pair[i] = new Pair(i, nums[i]);
    }
    
    Arrays.sort (pair, new Comparator<Pair>() {
        public int compare(Pair a, Pair b) {
            return a.n - b.n;
        }
    });
    
    for (int l = 0, r = 1; r < nums.length; r++) {
        while (l < r && pair[r].n - pair[l].n > target) {
            l++;
        }
        if (l < r && pair[r].n - pair[l].n == target) {
            result[0] = pair[r].idx + 1;
            result[1] = pair[l].idx + 1;
            Arrays.sort(result);
            return result;
        }
    }
    return result;
    //time :O(n log n);
    //space :O(n);
}