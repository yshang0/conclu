//90_k_Sum_II

public List<List<Integer>> kSumII(int[] A, int k, int target) {
    List<List<Integer>> result = new ArrayList<>();
    Arrays.sort(A);
    helper (k, target, 0, A, result, new ArrayList<>());
    return result;
}

public void helper (int k, int target, int idx, int[] A, List<List<Integer>> result, List<Integer> cur) {
    if (k == 0 && target == 0) {
        result.add(new ArrayList<>(cur));
        return;
    }
    if (idx == A.length) {
        return;
    }
    for (int i = idx; i < A.length; i++) {
        if (A[i] <= target) {
            cur.add(A[i]);
            helper (k - 1, target - A[i], i + 1, A, result, cur);
            cur.remove(cur.size() - 1);
        } else {
            break;
        }
    }
}
