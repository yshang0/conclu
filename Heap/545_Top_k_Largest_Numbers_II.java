//545_Top_k_Largest_Numbers_II

int[] A;
int size = 0, n = 0;
public Solution(int k) {
    size = k;
    A = new int[k];
    
}


public void add(int num) {
    
   if (n < size) {
       offer(num);
   } else if (num > A[0]) {
       poll();
       offer(num);
   }
   
}

public List<Integer> topk() {
    List<Integer> result = new ArrayList<>();
    for(int i = 0; i < n; i++) {
        result.add(A[i]);
    }
    Collections.sort(result, Collections.reverseOrder());
    return result;
}

public void offer (int num) {
    int k = n;
    A[n++] = num;
    
    while (k > 0) {
        int p = (k - 1) / 2;
        if (A[k] < A[p]) {
            int t = A[k];
            A[k] = A[p];
            A[p] = t;
        }
        k = p;
    }
}

public void poll() {
    A[0] = A[n - 1];
    n--;
    int k = 0;
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
        int t = A[minIndex];
        A[minIndex] = A[k];
        A[k] = t;
        
        k = minIndex;
    }
}