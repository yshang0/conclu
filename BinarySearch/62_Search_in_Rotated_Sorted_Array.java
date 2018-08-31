62_Search_in_Rotated_Sorted_Array

public class Solution {
    /**
     * @param A: an integer rotated sorted array
     * @param target: an integer to be searched
     * @return: an integer
     */
    public int search(int[] A, int target) {
        if(A == null || A.length == 0) {
            return -1;
        }
        int start = 0, end = A.length - 1;
        
        while(start + 1 < end) {
            int mid = start + (end - start) / 2;
            if(A[mid] == target) {
                return mid;
            }
            if(A[mid] >= A[start]) {
                if(target < A[mid] && target >= A[start]) {
                    end = mid;
                } else {
                    start = mid;
                }
            } else if(A[mid] < A[start]) {
                if(target < A[start] && target > A[mid]) {
                    start = mid;
                } else {
                    end = mid;
                }
            }
        }
        
        if(A[start] == target) {
            return start;
        }
        if(A[end] == target) {
            return end;
        } 
        return -1;
    }
}