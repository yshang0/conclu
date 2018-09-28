//464_Sort_Integers_II


public void sortIntegers2(int[] A) {
    helper (A, 0, A.length - 1);
   
}

public void helper (int[] A, int start, int end) {
    if (start >= end) {
        return;
    }
    
    int mid = start + (end - start) / 2;
    
    helper (A, start, mid);
    helper (A, mid + 1, end);
    
    int left = start, right = mid + 1, idx = 0;
    
    int[] temp = new int[end - start + 1];
    
    while (left <= mid && right <= end) {
        if (A[left] <= A[right]) {
            temp[idx++] = A[left++]; 
        } else {
            temp[idx++] = A[right++];
        }
    }
    while (left <= mid) {
        temp[idx++] = A[left++];
    }
    while (right <= end) {
        temp[idx++] = A[right++];
    }
    
    for (int i = start; i <= end; i++) {
        A[i] = temp[i - start];
    }
}
//time :O(NlogN);
//space:O(NlogN);