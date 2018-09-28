//183_Wood_cut

public int woodCut(int[] L, int k) {
        int l = 1;
        int r = 0;
        for(int i : L) {
            r = Math.max(i, r);
        }
        while(l + 1 < r){
            int mid = l + (r - l) / 2;
            if(num(L, mid) >= k) {
                l = mid;
            } else {
                r = mid;
            }
        } //M = max length of wood;
          //logM
        
        if(num(L, r) >= k){
            return r;
        }
        if(num(L, l) >= k) {
            return l;
        }
        return 0;
    }
    
    public int num (int[] l, int mid) {
        int sum = 0;
        for(int i : l) {
            sum += i / mid;
        }
        return sum;
    } //O(l.length);
    
    
    // Time : O(n * logM);
    // Space: O(1);