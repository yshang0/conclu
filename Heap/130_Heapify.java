//130_Heapify

public void heapify(int[] A) {
    int n = A.length;
    for(int i = (n - 2) / 2; i >= 0; i--) {
        helper(A, i);
    }        
}

private void helper(int[] A, int k) {
    int n = A.length;
    while(k < n) {
        int left = 2 * k + 1, right = 2 * k + 2;
        int minIndex = k;
        if(left < n && A[left] < A[minIndex]) {
            minIndex = left;
        }
        if(right < n && A[right] < A[minIndex]) {
            minIndex = right;
        }
        
        if(minIndex == k) {
            break;
        }
        
        int t = A[k];
        A[k] = A[minIndex];
        A[minIndex] = t;
        k = minIndex;
    }
    //Time:O(n);
    //space:O(n);
}