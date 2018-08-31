28_Search_a_2D_Matrix


public class Solution {
    /**
     * @param matrix: matrix, a list of lists of integers
     * @param target: An integer
     * @return: a boolean, indicate whether matrix contains target
     */

    //matrix[end / n][end % n] both is "n", not "m"
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }
        int m = matrix.length, n = matrix[0].length;
        int start = 0, end = m * n - 1;
        while(start + 1 < end) {
            int mid = start + (end - start) / 2;
            if(matrix[mid / n][mid % n] == target) {
                return true;
            }
            if(matrix[mid / n][mid % n] > target) {
                end = mid;
            }
            if(matrix[mid / n][mid % n] < target) {
                start = mid;
            }
        }
        if(matrix[start / n][start % n] == target) {
            return true;
        }
        if(matrix[end / n][end % n] == target) {
            return true;
        }
        return false;
    
    }
}