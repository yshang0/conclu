//532_Reverse_Pairs


public long reversePairs(int[] A) {
    return helper (A, 0, A.length - 1);
}

public long helper (int[] A, int start, int end) {
    if(start >= end) {
        return 0;
    }
    
    long sum = 0;
    int mid = start + (end - start) / 2;
    sum += helper(A, start, mid);
    sum += helper(A, mid + 1, end);
    sum += merge(A, start, mid, end);
    
    return sum;
}

public long merge (int[] A, int start, int mid, int end) {
    long sum = 0;
    
    int[] temp = new int[A.length];
    int left = start;
    int right = mid + 1;
    int idx = start;
    
    while (left <= mid && right <= end) {
        if (A[left] <= A[right]) {
            temp[idx++] = A[left++];
        } else {
            temp[idx++] = A[right++];
            sum += (mid - left + 1);
        }
    }
    
    while (left <= mid) {
        temp[idx++] = A[left++];
      
    }
    while (right <= end) {
        temp[idx++] = A[right++];
    }
    
    for(int i = start; i <= end; i++) {
        A[i] = temp[i];
    }
    return sum;
}

//Time :O(NlogN);
//space:O(N);