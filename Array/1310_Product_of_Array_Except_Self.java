//1310_Product_of_Array_Except_Self

public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] A = new int[n];
        int[] B = new int[n];
        
        A[0] = 1;
        for(int i = 1; i < n; i++) {
            A[i] = A[i - 1] * nums[i - 1];
        }
        
        B[n - 1] = 1;
        for(int j = n - 2; j >= 0; j--) {
            B[j] = B[j + 1] * nums[j + 1];
        }
        
        int[] result = new int[n];
        for(int k = 0; k < n; k++) {
            result[k] = A[k] * B[k];
        }
        return result;
    }