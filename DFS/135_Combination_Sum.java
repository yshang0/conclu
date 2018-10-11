//135_Combination_Sum

public List<List<Integer>> combinationSum(int[] candidates, int target) {
    List<List<Integer>> result = new ArrayList<>();
    Arrays.sort (candidates);
    helper (candidates, 0, target, result, new ArrayList<>());
    return result;
}
public void helper (int[] candidates, int index, int target, List<List<Integer>> result, List<Integer> cur) {
    
    if (index == candidates.length) {
        if (target == 0) {
            result.add(new ArrayList<>(cur));
        }
        return;
    }
    
    for (int count = 0; count * candidates[index] <= target; count++) {
        for (int i = 0; i < count; i++) {
            cur.add(candidates[index]);
        }
        
        while (index < candidates.length - 1 && candidates[index] == candidates[index + 1]) {
            index = index + 1;
        }
        helper(candidates, index + 1, target - count * candidates[index], result, cur);
        
        for (int i = 0; i < count; i++) {
            cur.remove(cur.size() - 1);
        }
    }
}
//time:O()