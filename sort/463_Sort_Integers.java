//463_Sort_Integers

public class Solution {
    /**
     * @param A: an integer array
     * @return: nothing
     */

    //选择排序
    public void sortIntegers(int[] A) {
        for(int i = 0; i < A.length - 1; i++) {
            for(int j = i + 1; j < A.length; j++) {
                if(A[j] < A[i]) {
                    int temp = A[j];
                    A[j] = A[i];
                    A[i] = temp;
                }
            }
        }
    }

    //插入排序
    public void sortIntegers(int[] A) {
        for(int i = 0; i < A.length; i++) {
            int temp = A[i];
            
            int j = i - 1;
            while(j >= 0 && A[j] > temp) {
                A[j + 1] = A[j];
                j--;
            }
            A[j + 1] = temp;
        }
    }
    //冒泡排序
    public void sortIntegers(int[] A) {
        for(int i = A.length - 1; i >= 0; i--) {
            int j = 0;
            while(j <= i - 1) {
                if(A[j] > A[j + 1]) {
                    int temp = A[j];
                    A[j] = A[j + 1];
                    A[j + 1] = temp;
                }
                j++;
            }
        }
    }
}
