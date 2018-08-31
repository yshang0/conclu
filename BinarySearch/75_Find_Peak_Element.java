//75_Find_Peak_Element


public class Solution {
    /**
     * @param A: An integers array.
     * @return: return any of peek positions.
     */

    //there must have a peak since A[0] < A[1] && A[length - 2] > A[length -1];
    public int findPeak(int[] A) {
        if(A == null || A.length == 0) {
            return -1;
        }
        int start = 0, end = A.length - 1;
        while(start + 1 < end) {
            int mid = start + (end - start) / 2;
            if(A[mid] > A[mid + 1] && A[mid] > A[mid - 1]) {
                return mid;
            }
            if(A[mid] < A[mid - 1]) {
                end = mid;
            }
            if(A[mid] > A[mid - 1]) {
                start = mid;
            }
        }
        if(A[start] > A[start + 1] && A[start] > A[start - 1]) {
            return start;
        }
        if(A[end] > A[end + 1] && A[end] > A[end - 1]) {
            return end;
        }
        return -1;
    }
}