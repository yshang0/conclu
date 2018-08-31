//769_Spiral_Array
public class Solution {
    /**
     * @param n: a Integer
     * @return: a spiral array
     */
    public int[][] spiralArray(int n) {
        int[][] result = new int[n][n];
        int[] dx = {0, 1, 0, -1};
        int[] dy = {1, 0, -1, 0}; // used to control the direction of index;
        
        boolean[][] v = new boolean[n][n];
        int direction = 0; // used to count the times of change direction
        int x = 0, y = 0; // we need to start from {0,0};
        for(int i = 1; i <= n * n; i++) {
            result[x][y] = i;
            v[x][y] = true;
            
            int xx = x + dx[direction % 4];
            int yy = y + dy[direction % 4]; 
            
            if(xx < 0 || yy < 0 || xx >= n || yy >= n || v[xx][yy]) { // here is the point used to change the direction;
                direction++; 
                xx = x + dx[direction % 4];
                yy = y + dy[direction % 4]; 
            }
            x = xx;
            y = yy;
        }
        return result;
    }
}
