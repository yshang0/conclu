//162_Set_Matrix_Zeroes

public void setZeroes(int[][] matrix) {
    if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
        return;
    }
    boolean r = false;
    boolean c = false;
    int m = matrix.length;
    int n = matrix[0].length;
    
    for (int i = 0; i < m; i++) {
        for (int j = 0; j < n; j++) {
            
            if (matrix[i][j] == 0) {
                if (i == 0) {
                    r = true;
                }
                if (j == 0) {
                    c = true;
                }
                matrix[i][0] = 0;
                matrix[0][j] = 0;
            }
        }
    }
    
    for (int a = 1; a < m; a++) {
        for (int b = 1; b < n; b++) {
            if (matrix[a][0] == 0 || matrix[0][b] == 0) {
                matrix[a][b] = 0;
            }
        }
    }
    
    if (r) {
        for (int t = 0; t < n; t++) {
            matrix[0][t] = 0;
        }
    }
    if (c) {
        for (int k = 0; k < m; k++) {
            matrix[k][0] = 0;
        }
    }
}

//time:O(nm);
//space:O(1);