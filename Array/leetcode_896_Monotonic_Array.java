//leetcode_896_Monotonic_Array


public boolean isMonotonic(int[] A) {
    if (A == null) {
        return false;
    }
    if (A.length <= 2) {
        return true;
    }
    
    boolean increase = true;
    boolean decrease = true;
    for (int i = 1; i < A.length; i++) {
        increase = increase && A[i - 1] <= A[i];
        decrease = decrease && A[i - 1] >= A[i];
    }
    return (increase || decrease);
    //Time: O(n);
    //space: O(1);
}